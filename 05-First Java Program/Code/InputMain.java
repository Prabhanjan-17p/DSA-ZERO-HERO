import java.util.Scanner;

public class InputMain {
    public static void main(String[] args) {

        //Scanner is a class that's allow to take input from the user
        //And sc is a object of class Scanner when ever you write something mean user input the the sc object
        Scanner sc = new Scanner(System.in);

        //String
        System.out.println("Hey how are you!");
        String ss = sc.nextLine();
        System.out.println("Hey how are you "+ ss);

        //Int
        int a ;
        System.out.println("Enter a number : ");
        a = sc.nextInt();
        System.out.println("The number is = "+a);

        //Float
        float fd ;
        System.out.println("Enter a floating point : ");
        fd = sc.nextFloat();
        System.out.println("The floating number is =");

        //char
        char c;
        System.out.println("Enter a your favorite character ");
        c = sc.next().charAt(0);
        System.out.println("Your favorite character = "+c);


    }
}
