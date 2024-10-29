/*
    Binary Search 2d
        solution
            -- case1- if element == target
                    Ans= element
            -- case2- if element < target
                    Ans= row++
            -- case1- if element > target
                    Ans= column--

            -- in 2d array the lower bound is arr[0][0] and upper bound is arr[0][array.lastElement]
            -- In last column of array , The "Target < last column of an 2d array"
 */

import java.util.Arrays;

public class BinarySearch2D {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        System.out.println(Arrays.toString(search(arr,429)));
//        System.out.println(search(arr,37));
    }
    static int[] search(int[][] arr,int target){
        int r =0;
        int c = arr.length-1;

        while (r < arr.length && c >= 0){
            // there are 3 condition apply here
            if (arr[r][c] ==  target) {
                return  new int[]{r,c};
            }
            if (arr[r][c] <  target) {
                r++;
            } else { // arr[r][c] > target
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
