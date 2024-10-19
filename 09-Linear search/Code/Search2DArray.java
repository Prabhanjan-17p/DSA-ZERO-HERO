import java.util.Arrays;

public class Search2DArray {
    public static void main(String[] args) {
        int[][] arr ={
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {98,12}
        };
        int target =98;
//        System.out.println(search(arr,target));

        //if you are to return a the index of correct number
        int[] ans = search(arr,target); // return like --> {row , column}
        System.out.println(Arrays.toString(ans));
    }

    //it is gives the out put is like a array {row,column}
    static  int[] search(int[][] arr,int target){
        int ans =0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) { // it check the 0-n, rows of length (arr[row].length)
                if (arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    //output is -- if find the number it return 1 then return -1
//    static  int search(int[][] arr,int target) {
//        int ans = 0;
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) { // it check the 0-n, rows of length (arr[row].length)
//                if (arr[row][col] == target) {
//                    return 1;
//                }
//            }
//        }
//        return -1;
//    }
}
