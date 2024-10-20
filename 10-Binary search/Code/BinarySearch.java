/*
      //linear Search//
          In linear Search the elements are search are in 0 to n number of element

      //Binary Search//
      If the array is
      array = [2,3,4,6,9,11,12,14,20,36,48] (if are not sort then most be sort the array)
      target = 36
      1- First Sorting the array
      2- Then find the middle element
      3- check ,If the target element is grater than middle element (target > middle ) then,It check only right part of the middle elements (end will same but start will start=mid+1)
              , If the target element is smaller than middle element (target < middle ) then, It check only left  part of the middle elements (start are same but end will end=mid-1)
      4- If middle element == target element then the answer is middle element

      END-- If ( Start > End ) then the element not found

      Best Case --> If 1st check case is found out the result or target (means the first middle element)

      Worst Case --> The total number of compression (k) is -- Log(N), (It means k=log(N))

      Note --> In case of search 1 million of a array element
              (In Worst Case)
              Linear Search -- it take 1 million check to find
              Binary Search -- it take 20 step to find
       */

public class BinarySearch {
    public static void main(String[] args) {
        //If array is sorted
        int[] arr = {-12,-10,-8,-3,1,3,4,6,8,12,14,23,56,99};
        int target = 1224;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
//        System.out.println(arr[ans]);
    }
    //return the index
    //return -1 if dose not exist
    static int binarySearch(int[] arr ,int target ){
        int start = 0;
        int end = arr.length - 1;

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
        return  -1;
    }
}
