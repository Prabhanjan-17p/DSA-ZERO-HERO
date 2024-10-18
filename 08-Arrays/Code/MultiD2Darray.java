import java.util.Arrays;
import java.util.Scanner;

public class MultiD2Darray {
    public static void main(String[] args) {
        /*
         1 2 3
         4 5 6
         7 8 9
         */


        Scanner sc = new Scanner(System.in);
//        //In this case the number of rows is mandatory
//        int[][] arr = new int[3][];
//        int[][] arr1 = {
//                            {1,2,3}, //oth index
//                            {4,5,6},//1st index
//                            {7,8,9}//3th index
//        };
//        //The index[0] of arr1 is {1,2,3} and as soon as
//        //In 2D array each array has different object
//        System.out.println(Arrays.toString(arr1[0]));
//        System.out.println(arr1[0][1]);

        //Input 2D array
        int[][] arr2 = new int[3][3];
//        System.out.println(arr2.length);// return number of rows
        for (int row = 0; row < arr2.length ; row++) {//for row
            for (int col = 0; col < arr2[row].length; col++) { //for column a=
                arr2[row][col] = sc.nextInt();
            }
        }
        //output
        //Every single an array is it self an array
        for (int row = 0; row < arr2.length ; row++) {//for row
            for (int col = 0; col < arr2[row].length; col++) { //for column a=
                System.out.print(arr2[row][col] +" ");
            }
            System.out.println(" ");
        }
        //output 2
        for (int row = 0; row < arr2.length ; row++) {//for row
            System.out.println(Arrays.toString(arr2[row]));
        }
        //output 3
        for (int[] a :arr2){
            System.out.println(Arrays.toString(a));
        }
    }
}
