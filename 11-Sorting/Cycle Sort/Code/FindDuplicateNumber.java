import java.util.Arrays;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1,3,3,4,2};
//        sort(arr);
//        System.out.println(Arrays.toString(arr));
        System.out.println(sort(arr));
    }
    static int sort(int[] arr){
        int i =0;
        while (i < arr.length){
            if (arr[i] != i+1){
                int cI = arr[i]-1;
                if (arr[i] != arr[cI]){
                    swap(arr,i,cI);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }
    static void swap(int[] arr, int st , int end){
        int temp = arr[st];
        arr[st] = arr[end];
        arr[end] = temp;
    }
}
