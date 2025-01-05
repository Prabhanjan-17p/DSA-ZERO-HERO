public class PowerOf2 {
    public static void main(String[] args) {
        //fix for n=0 then show exception
        int n=79;
        boolean ans = ( n & (n-1)) == 0 ;
        System.out.println(ans);

//        System.out.println(4>>1); // 4/2^1
//        System.out.println(4/2*1); // 4/2^1
    }
}
