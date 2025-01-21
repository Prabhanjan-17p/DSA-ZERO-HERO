/*
    Square Root
    1- 36 => 6*6
 */


public class findSquareRoot {
    public static void main(String[] args) {
        int num = 36;
        int p = 3;

        System.out.println(sqt(num,p));
    }
    static double sqt(int n , int p){
        int st =0;
        int en = n;

        double root  = 0.0;

        while (st <= n){
            int mid = st + (en-st)/2;

            if (mid * mid == n){
                root = mid;
                return  root;
            }

            if (mid*mid > n){
                en = mid-1;
            } else {
                st = mid+1;
            }
        }


        double icr = 0.1;
        for (int i= 0 ; i<p ; i++){
            while (root*root <= n){
                root = root+icr;
            }
            root = root-icr;
            icr = icr/10;
        }

        return  root;
    }
}
