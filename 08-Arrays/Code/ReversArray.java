import java.util.Arrays;

public class ReversArray {
    public static void main(String[] args) {
        //It is called two pointer methods
        int[] arr ={1,2,23,9,18};
        revers(arr);

        System.out.println(Arrays.toString(arr));
    }
    static void  revers(int[] arr){
        int start =0;
        int end = arr.length-1;

        while (start < end){
            //swap
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static void  swap(int[] arr,int index,int index2){
        int temp = arr[index];
        arr[index]= arr[index2];
        arr[index2]=temp;
    }

}
