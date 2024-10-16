import java.util.Scanner;

public class Method {
    static void Sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Number: ");
        int num1=sc.nextInt();
        System.out.println("Enter The Second Number: ");
        int num2=sc.nextInt();
        int sum = num1+num2;
        System.out.println("Sum = "+sum);
    }
    static int Sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Number: ");
        int num1=sc.nextInt();
        System.out.println("Enter The Second Number: ");
        int num2=sc.nextInt();
        int sum = num1+num2;

        return sum;
//        System.out.println("These will be not executed");
    }
    public static void main(String[] args) {
        //Take input of 2 number print there sum
        Scanner sc = new Scanner(System.in);
        int num1=0,num2=0,sum=0;
        System.out.println("Enter The First Number: ");
         num1=sc.nextInt();
        System.out.println("Enter The Second Number: ");
         num2=sc.nextInt();
         sum = num1+num2;
        System.out.println("Sum = "+sum);

        //after display it again quenstion to the user " Do you want to print next 10 time "
        Sum();
        Sum2();



        //Syntax Of Function
//        return type Name(){
//          body//
//        }
    }
}
