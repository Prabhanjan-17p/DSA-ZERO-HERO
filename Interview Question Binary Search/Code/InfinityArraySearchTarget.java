/*
    It is a infinity array means you don't known the size of array (do not used array.length)
            Solution
                1- first we check changs on changs(means a particular range)
                2- then check the range to between in this range find the target
                        if found then search the binary search is given range
                        if not found then transform the end start become start and end become new end
 */

public class InfinityArraySearchTarget {
    public static void main(String[] args) {
       int[] arr = {3,5,7,9,10,90,100,130,140,160,170}; //suppose it is a infinity array
        int target = 10;
        System.out.println(findRange(arr,target));
    }
    static int findRange(int[] arr,int target){
        //Start with the box of size 2
        int start =0;
        int end=1;

        //condition for the target to lie in the range
        while (target > arr[end]){
            int newStart = end+1;
            // calculate the box size --> (end-start+1) (Ex=  start=0, end =1 , then size = 1-0+1 = 2)
            // doubling  the box size (means newEnd point)--> (end-start+)*2
            end = end + (end-start+1)*2; // end = 1 + (1-0+1)*2 = 1+ 2*2 = 1+4 =5 (means start point = 2 , end =5)
            start = newStart;
        }
        return  InfinitySearch(arr,target,start,end);
    }
    static int InfinitySearch(int[] arr,int target,int start,int end){

         while (start <= end){
             int mid = start +(end-start)/2;

             if (target < arr[mid]) {
                 end = mid-1;
             } else if (target > arr[mid]){
                 start = mid+1;
             } else {
                 return mid;
             }
         }
        return -1;
    }
}
