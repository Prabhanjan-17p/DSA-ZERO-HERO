import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number for checking it is prime or not");
        int n = sc.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);

        //print a number is armstrong or not in 3numbers
        System.out.println("Enter a 3digit Number checking it is Armstrong number or not: ");
        int num = sc.nextInt();
        boolean ans2 = isArmstrong(num);
        System.out.println(ans2);
        
        //Print all 3 digit armstrong number
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)){
                System.out.print(i+"  ");
            }
        }
    }
    //Armstrong or not in 3numbers
    static boolean isArmstrong(int num){
        int original = num;
        int sum=0;

        while (num > 0){
            int rem = num%10;
            num = num/10;
            sum = sum+(rem*rem*rem);
        }
        if (sum == original){
            return true;
        }
        return false;
    }

    //Prime or not
    static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        int c= 2;
        while (c*c <= n){
            if (n%c == 0){
                return false;
            }
            c++;
        }
        if (c*c > n){
            return true;
        }
        return false;
    }
}
