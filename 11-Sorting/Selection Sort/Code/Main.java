/*
        Selection Sort
                -- Is that mean is select a element and put in to the correct or right position
                arr[] ={4,5,1,2,3}
                --1 - find large and put into the last of array fixed the position
                        -- ex arr[] ={4,5,1,2,3}
                        --1.1 large element is 5 put into last --> {4,3,1,2,5}
                        --1.2 large element is 4 put into last --> {2,3,1,4,5}
                        --1.3 large element is 3 put into last --> {2,1,3,4,5}
                        --1.4 large element is 2 put into last --> {1,2,3,4,5}

                        --Best case = O(N^2)
                        --Worst case = O(N^2)
                        -- It is not stable
                        -- It preform well in small list
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[] ={4,5,1,2,3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //Find the maximum item in the remaining array and swap with correct index
            int lastIndex = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,lastIndex);

            swapArray(arr,maxIndex,lastIndex);
        }
    }

    static void swapArray(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[] arr,int start , int end){
        int max = start;
        for (int i = start ; i <= end ; i++) {
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
