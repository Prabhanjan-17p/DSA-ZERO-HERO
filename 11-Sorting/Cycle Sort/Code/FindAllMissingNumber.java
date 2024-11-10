import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllMissingNumber {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
//        sort(arr);
        System.out.println(sort(arr));
    }
    static List<Integer> sort(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correctI = arr[i]-1; //finding the correct index
            if (arr[i] != arr[correctI]){
                swap(arr,i,correctI);
            } else {
                i++;
            }
        }
//        System.out.println(Arrays.toString(arr));
        List<Integer> ans = new ArrayList<>() ;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j+1){
                ans.add(j+1);
            }
        }
        return ans;
    }
    static void  swap(int[] arr,int st,int end){
        int temp = arr[st];
        arr[st] = arr[end];
        arr[end] = temp;
    }
}
