//method-1
//public class findPrimeRange {
//    public static void main(String[] args) {
//        int num = 20;
//        for (int i = 0; i < num; i++) {
//            boolean ss = isPrime(i);
//            if (ss == true){
//                System.out.println(i+" is a Prime Number");
//            }
//        }
////        System.out.println(isPrime(num));
//    }
//    static boolean isPrime(int n){
//        if (n <=1 ){
//            return false;
//        }
//        int c =2;
//        while (c*c <= n){
//            if (n%c ==0){
//                return false;
//            }
//            c++;
//        }
//        return true;
//    }
//}

//method-2
public class findPrimeRange {
    public static void main(String[] args) {
       int n=40;
       boolean[] arr = new boolean[n+1];
       isPrime(n,arr);
    }
    //False in array means number is prime
    static void isPrime(int n,boolean[] primes){
        for (int i = 2; i*i <= n; i++) {
            if (!primes[i]){
                for (int j = i*2; j <=n  ; j+=i) { // it mark as all the multiply of 2 are not prime
                    primes[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (primes[i] == false){
                System.out.print(i+" ");
            }
        }
    }
}
