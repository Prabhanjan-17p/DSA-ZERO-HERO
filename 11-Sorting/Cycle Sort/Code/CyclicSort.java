import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int arr[] = {3,5,2,1,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void  sort(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correctI = arr[i]-1; //finding the correct index
            if (arr[i] != arr[correctI]){
                swap(arr,i,correctI);
            } else {
                i++;
            }
        }
    }
    static void swap(int[] arr,int st ,int en){
        int temp = arr[st];
        arr[st] = arr[en];
        arr[en] = temp;
    }
}
