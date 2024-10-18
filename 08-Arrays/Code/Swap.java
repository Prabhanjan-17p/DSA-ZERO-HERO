import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr ={1,2,23,9,18};
        swap(arr,1,4);

        System.out.println(Arrays.toString(arr));
    }
    static void  swap(int[] arr,int index,int index2){
        int temp = arr[index];
        arr[index]= arr[index2];
        arr[index2]=temp;
    }
}
