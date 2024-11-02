/*
        FirstLastPositionInSortedArray
        arr = { 5,7,7,7,7,8,8,10}
        target 7
        Find the first and last position of 7
             ans is [1,4]
        Solution --
                1-First find first occurrence of target(7)

 */


import java.lang.reflect.Array;
import java.util.Arrays;

public class FirstLastPositionInSortedArray {
    public static void main(String[] args) {
        int[] arr = {5,7,7,7,7,8,8,10};
        int target = 7;
        int[] ans = FLPISA(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] FLPISA(int[] arr, int target){

        int[] myAns = {-1,-1};

        int start = search(arr,target,true);
        int end = search(arr,target,false);

        //if another (reduce time complicity)
//        if (start != -1){
//            myAns[1] = search(arr,target,false);
//        }

        myAns[0] =start;
        myAns[1] = end;
//        System.out.println(myAns);
        return  myAns;
    }

    static int search(int[] nums, int target , boolean findStartIndex){
        int ans =-1;
        int start =0;
        int end = nums.length-1;
        while (start <= end){
            int mid = start + (end-start)/2;
            if (target < nums[mid]){
                end = mid -1;
            } else if (target > nums[mid]) {
                start = mid +1;
            } else {
                ans = mid;
                if (findStartIndex == true){
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            }
        }
        return ans;

    }
}
