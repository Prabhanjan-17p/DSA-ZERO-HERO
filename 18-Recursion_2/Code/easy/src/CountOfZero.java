public class CountOfZero {
    public static void main(String[] args) {
        System.out.println(count(302010));
    }

    static  int count(int num){
        return  helper(num ,0);
    }

    //Helper function used to pass the value the form the recursion call
    static  int helper(int n,int c){
        if (n==0){
            return c;
        }
        int rem = n %10;
        if (rem == 0){
            return helper(n/10,c+1);
        }
        return helper(n/10,c);
    }
}
