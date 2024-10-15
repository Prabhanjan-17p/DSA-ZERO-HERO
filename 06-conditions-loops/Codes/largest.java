import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2,num3;
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();
        if (num1 > num2 && num1 >num3){
            System.out.println("max= "+ num1);
        } else if (num2 > num3){
            System.out.println("max= "+num2);
        } else {
            System.out.println("max= "+num3);
        }
        //or
        int max = num1;
        if (num2 > max){
            max = num2;
        }
        if (num3 >max){
            max = num3;
        }
        System.out.println("max= "+max);

        //or
        int mxa2 = Math.max(num3,Math.max(num1,num2));
        System.out.println("max= "+mxa2);
    }
}
