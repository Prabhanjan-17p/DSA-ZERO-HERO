/*
    q- Find the missing number of an 0-n array
 */

import java.util.Arrays;

public class MissingArray {
    public static void main(String[] args) {
        int[] arr = {4,0,2,1};
//        sort(arr);
        System.out.println(sort(arr));
    }
    static int sort(int[] arr){
        int i=0;
        while (i <arr.length) {
            int correctI = arr[i];
            if ( arr[i] < arr.length && arr[i] != arr[correctI]){
                swap(arr,i,correctI);
            } else {
                i++;
            }
        }
        //search the missing element
        //case-1
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j){
                return j;
            }
        }

        //case-2
        return arr.length;
    }
    static void swap(int[] arr , int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp ;
    }
}
