public class fibo {
    public static void main(String[] args) {
//        System.out.println(fibo1(7)); // it's not gives you answer
//        System.out.println(fiboFormula(7)); // it's not gives you answer

        for (int i = 0; i < 11; i++) {
            System.out.println(fiboFormula(i));
        }
        System.out.println(fiboFormula(50)); // it gives the answer because the time complexity faster than recursion
    }

    static int fiboFormula(int n){
//       return (int) ((Math.pow(((1 + Math.sqrt(5))/2),n) - Math.pow(((1 - Math.sqrt(5))/2),n))/ Math.sqrt(5));
       return (int) (Math.pow(((1 + Math.sqrt(5))/2),n)/ Math.sqrt(5)); // remove less dominating
    }

    static int fibo1(int n){
        if (n < 2){
            return n;
        }
        return fibo1(n-1)+fibo1(n-2);
    }
}
