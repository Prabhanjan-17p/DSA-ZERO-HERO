/*
        Factor Of Number
            x = 20 ==> 1,2,4,5,10,20 --> This number are divisible by 20
 */

public class FactorOfNumber {
    public static void main(String[] args) {
        fact2(20);
    }

    //O(N)
    static  void fact(int n){
        for (int i = 1 ; i<= n ; i++){
            if (n % i == 0){
                System.out.print(i + " ");
            }
        }
    }

    //O(SQT(N))
    static  void fact2(int n){
        for (int i = 1 ; i<= Math.sqrt(n) ; i++){
            if (n % i == 0){
                if (n/i == i){
                    System.out.print(i +" ");
                } else {
                System.out.print(" " + i + " " + n/i);
                }
            }
        }
    }
}
