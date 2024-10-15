import java.util.Scanner;

public class Fibonaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //0 1 , 1 2 3 5 8 13 21 34 55  89..........(Fibonacci)
        int num1 = 0;
        int num2=1;
        int count =2;
        int n = sc.nextInt();
        while ( count <= n){
            int temp = num2;
            num2 = num2+num1;
            num1 = temp;
            count++;
        }
        System.out.println(num2);
    }
}
