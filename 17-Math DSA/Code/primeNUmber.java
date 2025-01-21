public class primeNUmber {
    public static void main(String[] args) {
        int num = 50;
        for (int i = 0; i < num; i++) {
            System.out.println(i+" = "+isPrime(i));
        }
        System.out.println(isPrime(num));
    }
    static boolean isPrime(int n){
        if (n <=1 ){
            return false;
        }
        int c =2;
        while (c*c <= n){
            if (n%c ==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
