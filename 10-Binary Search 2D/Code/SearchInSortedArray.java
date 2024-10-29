/*
    Search in Sorted Array
        Solution
            --First we will take the middle column of an 2D array
            -- then in this column find the middle element

            -- case1- if element == target
                    ans = element
            -- case2- if element > target
                    ans = ignore bellow all the row
            -- case3- if element < target
                    ans = ignore above row

            -- in the end 2 rows are reaming
                    --1- check weather mid column you are at contain the ans  [2,6]
                    --2- consider the 4 parts
 */

import java.util.Arrays;

public class SearchInSortedArray {
    public static void main(String[] args) {
        int[][] arr ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(search(arr,26)));
    }

    //Search in the row provided  between the column provided
    static int[] binarySearch(int[][] arr,int r,int cs,int ce,int target){
        while (cs <= ce){
            int mid = cs+(ce-cs)/2;

            if (arr[r][mid] == target){
                return new int[]{r,mid};
            }
            if (arr[r][mid] < target){
                cs = mid+1;
            } else { //(arr[r][mid] < target) // cs-column start // ce-column end
                ce = mid-1;
            }
        }
        return new int[]{-1,-1};
    }

    static int[] search(int[][] arr , int target){
        int r = arr.length;
        int c = arr[0].length; // be cautious, array may be

        if (r == 1) { // if you have one row
            return binarySearch(arr,0,0,c-1,target);
        }

        int rStart=0;
        int rEnd=r-1;
        int cMid = c/2;
        //run the loop till 2 row are reaming
        while (rStart < (rEnd-1)){ // when this condition was true the you known that , more than 2 rows are here
            int mid = rStart +(rEnd-rStart)/2;

            if (arr[mid][cMid] == target){
                return new int[]{mid,cMid};
            }
            if (arr[mid][cMid] < target){
                rStart = mid;
            } else { //arr[mid][cMid] > target
                rEnd = mid ;
            }
        }
        // now we have 2 rows
        //check weather the target is in the column of 2 rows
        if (arr[rStart][cMid] == target){
            return new int[]{rStart,cMid};
        }
        if (arr[rStart+1][cMid] == target){
            return new int[]{rStart+1,cMid};
        }

        //search in 1st half
        if (target <= arr[rStart][cMid-1]){
            return binarySearch(arr,rStart,0,cMid-1,target);
        }
        //search in 2nd half
        if (target >= arr[rStart][cMid+1] && target <= arr[rStart][c-1]){
            return binarySearch(arr,rStart,cMid+1,c-1,target);
        }
        //search in 3rd half
        if (target <= arr[rStart+1][cMid-1]){
            return binarySearch(arr,rStart+1,0,cMid-1,target);
        }
        //search in 4th half
        if (target <= arr[rStart+1][cMid+1]){
            return binarySearch(arr,rStart+1,cMid+1,c-1,target);
        }
        return new int[]{-1,-1};
    }
}
