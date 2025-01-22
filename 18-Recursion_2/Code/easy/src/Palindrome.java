public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome(11));
    }
    static int ss =0;
    static int rev1(int n){
        if (n == 0){
            return 0;
        }
        int rem = n%10;
        ss = ss*10+rem;
        return rev1(n/10);
    }

    static int rev2(int n){
        int digit = (int)(Math.log10(n)+1);
        return helper(n,digit);
    }

    private static int helper(int n, int digit) {
        if (n%10 == n){
            return n;
        }
        int rem = n%10;
        return rem * (int) Math.pow(10,digit-1) + helper(n/10,digit-1);
    }

    //palindrome
    static boolean palindrome(int n){
        return n == rev2(n);
    }

    //Count of Zero

}
