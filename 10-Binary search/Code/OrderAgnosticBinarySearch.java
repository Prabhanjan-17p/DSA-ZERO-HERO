/*
//Order Agnostic Binary Search//
    -- in this case the array sorted but you don't know the array is sorting in ascending or descending order
    -- solution
            --if (Start > End) then it is "ascending"
            --if (Start < End) then it is "descending"

If the array id Sort in descending then the search will be
arr = [90,75,67,54,43,32,22,12,5,2]
target 67
1- Find the middle element (start+end/2)
2- Check
        -If target > middle , then it check left part (start are same but end will end=mid-1)
        -If target < middle , then it check right part (end will same but start will start=mid+1)
 */

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {-12,-10,-8,-3,1,3,4,6,8,12,14,23,56,99}; //ascending
        int[] arr1 = {99,78,66,56,45,33,22,21,12,4,-1,-5,-21}; //descending
        int target = -5;
        int ans = orderABS(arr1,target);
        System.out.println(ans);
    }
    static int orderABS(int[] arr ,int target ){
        int start = 0;
        int end = arr.length - 1;

        //find whether the array is sorted in ascending or  descending
        boolean isAsc;
        if (arr[start] < arr[end]){
            isAsc = true;
        } else {
            isAsc = false;
        }

        while (start <= end) {
            // find the middle element
//            int mid = (start+end)/2; //might be possible that (start + end) exceeds the range of int in java (so in this case it will gives you error)
            int mid = start + (end-start)/2; // batter way to find mid value

            if (arr[mid] == target){
                return mid;
            }

            if (isAsc){
                if (target < arr[mid]){
                    end = mid-1;
                } else if (target > arr[mid]) {
                    start = mid+1;
                }
            } else {
                if (target > arr[mid]){
                    end = mid-1;
                } else if (target < arr[mid]) {
                    start = mid+1;
                }
            }

        }
        return  -1;
    }
}
