import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Array of primitive
        int[] arr = new int[5];
        //the Length is  = size -1 (means 5-1=4)
//        arr[0]=12;
//        arr[1]=121;
//        arr[2]=124;
//        arr[3]=132;
//        arr[4]=123;
//        System.out.println(arr[3]);
//
//        //input using for loop
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
        //output
//        System.out.println(Arrays.toString(arr));

//        //for all out (for ech loop)
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] +" ");
//        }
//        System.out.println();
//        for ( int num : arr){
//            System.out.print(num+" ");
//        }

//        System.out.println(arr[6]); // it gives error ("Index 6 out of bounds for length 5")

        //Array object
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        for (String ss : str){
            System.out.print(ss+"");
        }
    }
}
