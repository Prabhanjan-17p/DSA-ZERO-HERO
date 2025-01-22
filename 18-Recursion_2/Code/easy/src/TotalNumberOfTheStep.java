public class TotalNumberOfTheStep {
    public static void main(String[] args) {
        System.out.println(NPFS(23));
    }
    static int NPFS(int num){
        return helper(num,0);
    }
    static int helper(int num,int step){
        if (num ==0 ){
            return step;
        }
        if (num % 2 == 0){
            return helper(num/2,step+1);
        }
        return helper(num-1,step+1);
    }
}
