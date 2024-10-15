import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Take input from the user until when the user not enter x or X

        int ans = 0;
        while (true){
            System.out.println("Enter Operation You Need To Be Executed");
            char op = sc.next().trim().charAt(0);
            if (op == '+'  || op=='-' || op=='*' || op=='/' || op=='%'){
                System.out.println("Enter 2 number : ");
                int num1= sc.nextInt();
                int num2= sc.nextInt();
                
                if (op == '+'){
                    System.out.println(num1+num2);
                }
                if (op == '-'){
                    System.out.println(num1-num2);
                }
                if (op == '*'){
                    System.out.println(num1*num2);
                }
                if (op == '%'){
                    System.out.println(num1%num2);
                }
                if (op == '/'){
                    if ( num2 != 0){
                        System.out.println(num1/num2);
                    }
                }
            } else if (op == 'x' || op =='X'){
                break;
            } else {
                System.out.println("Invalid operation you enter So pleas correct operator (If you press x or X then the process will be terminated)");
            }
        }
        System.out.println("Thank You Visit Again");
    }
}
