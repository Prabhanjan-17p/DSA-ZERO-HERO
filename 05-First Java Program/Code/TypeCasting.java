import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        //When one type data assign to another type of variable and automatic type conversion will take place if the following condition are made
        //--{" Implicit "}
        //It conversion when the destination type bigger than source type then it automatically typecast it is called {"Implicit typecast"}
        Scanner sc = new Scanner(System.in);
//        float ff = sc.nextFloat();
//        int ff = sc.nextFloat();
//       it gives you error because destination size is smaller than source size
//         System.out.println(ff);
//        int c = sc.next().charAt(0);
        //it gives you error because destination size is smaller than source size
//        System.out.println("It convert the ASCII value :"+c);

        //{" Explicit "}
//        int num =(int) 9.23f;
//        System.out.println(num);

        int w = 1123;
        byte b= (byte) w;
        // b = 1123 % 256 = 99
        System.out.println(b);


        //Actually catch here , The byte are store upto 256 but in this expression it store more than 256
        // Then in java when it execute a expression all the byte are converted into a integer value
        //The it is calculate = 40 * 50 / 100
        //                         200 / 100
        //                         20
        byte v= 40;
        byte n= 50;
        byte m= 100;
        int res = v*n / m;
        System.out.println(res);


        //It's give you error because 2 is a integer and "ne" is a byte that's so why you can not add or multiplying or some other case in a byte type of object
        //That's so why it give the error
//        byte ne = 50;
//        ne = ne *2;
//        System.out.println(ne);


        //The answer will be store in the bigger data type
        byte by = 12;
        int in = 12;
        short sh = 12;
        double dd = 12.12;
        float sb = 12.1212f;
        char cc = 'A';
//        int result = (int) ((int) (by*sb)+(in/sh)-(dd*cc));
        double result = ( (by*sb)+(in/sh)-(dd*cc));
        // short + int + double = double
        System.out.println(result);
    }
}
