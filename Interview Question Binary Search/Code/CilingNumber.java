/*
       //Ceiling of number
           means -- the smallest element in array greater or equal to an target element
           int[] arr ={2,3,5,9,14,16,18} target=14
           The ceiling of above array is 14 // ceiling(arr,target) = 14
           ceiling(arr,target=15) = 16
               // means , target=15 , 1- write the all element that are equal or greater than target ,Then the element of smallest number is the answer
        */

public class CilingNumber {
    public static void main(String[] args) {
        int[] arr ={2,3,5,9,14,16,18};
        int target=15;
        int ans = ceiling(arr,target);
        System.out.println(ans);
        System.out.println(arr[ans]);
    }
    //return the index = smallest number >= target
    static int ceiling(int[] arr , int target){
        int start=0,end=arr.length-1;

        //But what if the target is greater than the greatest number in the array
        if (target > arr[arr.length-1]){
            return -1;
        }
        while (start <= end) {
            // find the middle element
//            int mid = (start+end)/2; //might be possible that (start + end) exceeds the range of int in java (so in this case it will gives you error)
            int mid = start + (end-start)/2; // batter way to find mid value

            //check the target element
            if (target < arr[mid]){
                end = mid-1;
            } else if (target > arr[mid]) {
                start = mid+1;
            } else {
                return mid;
            }
        }
        return  start;
    }
}
