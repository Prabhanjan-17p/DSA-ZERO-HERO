/*
        Insertion Sort
                --We are sorting the array like partially
                -- arr[] = {5,3,4,1,2}
                --It sort the some index to some index partially like -- 0-2 and 2-3 and 3-5
                -- for every index : put that index element ath the correct index of left hand side
                --After first pass i=0 sort is  {3,5,4}
                --After second pass i=1 sort is  {3,4,5} like this sort

                Solution
                    --If i and j are 2 loop --> where i is outer loop and j is inner loop
                    --If i=0 where j=i+1 (because when i in last index of an error then j will be out of index so i will go i=0 to i-2)and j will always check his left i>j if true then swap
                    -- When element j is not smaller than j-1 then break the loop (j-1 > j && j > 0)

                Worst case
                    --O(N^2) , N is number of element (1,2,3,4,------ ,n-1) (sum of natural number is = n = n*(n+1)/2 , where n = (n-1), (n-1)(n-1+1)/2 => n^2-n => O(N^2) , where n and 2 are remove because of these are constant)
                    -- Descending sorted {5,4,3,2,1}
                Best Case
                    --When array is already sorted
                    --O(N)

                Why it is used
                    -- It is adaptive : step get reduced if array is sorted
                    --Number of swap reduce as compare bubble sort
                    --it is stable
                    --It is used for smaller values of N => works good when array is partially sorted  => It take parts in hybrid algorithm sorting
 */


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[] = {5,3,4,1,2};
        insertionSort(arr);


        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) { // it going actually i-2
            for (int j = i+1; j > 0 ; j--) {
                if (arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                } else {
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int st, int end){
        int temp = arr[st];
        arr[st] = arr[end];
        arr[end] = temp;
    }
}
