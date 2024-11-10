/*
    Sorting is -
     {2,6,3,8,5} --> {2,3,5,6,8}

            1-Bubble Sort
                    -- Basically it is a compression sort
                    -- in every step you comparing adjacent of element (means {2,3},{3,5},{6,8} like this )
                    -- in every rotation the last element will fixed means the largest element came on last
                    -- it is also called sinking sort and exchange sort

                    -- If "j" never swap for a particular time period is "i", then the execution stop means the array is sorted
                    --Best case compression is "N"
                    -- worst case is the array is descending the we have sort in ascending

                    --There are 2 Sort array
                        --1- Stable sorted --> when the original order is maintain for values that are equal called as stable
                        --1- Unstable sorted --> when the original order is not maintain for 2or more values are same called as unstable

 */

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        boolean swapped;
        //run the step n-1 time
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step , max item will come at the last respective index
            for (int j = 1; j < arr.length-i; j++) {
                //compare swap item is smaller than the previous item
                if (arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped =true;
                }
            }
            //if you did not swap for a particular value of i ,it means the array is sorted hence stop the program
            if (swapped == false ){
                break;
            }
        }
    }
}
