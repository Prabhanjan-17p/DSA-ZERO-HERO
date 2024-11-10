import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[]  sort(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correctI = arr[i]-1; //finding the correct index
            if (arr[i] != arr[correctI]){
                swap(arr,i,correctI);
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j+1){
                return new int[] {arr[j],j+1};
            }
        }
        return new int[] {-1,-1};
    }
    static void swap(int[] arr,int st ,int en){
        int temp = arr[st];
        arr[st] = arr[en];
        arr[en] = temp;
    }
}
