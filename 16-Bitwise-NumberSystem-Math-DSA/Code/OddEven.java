public class OddEven {
    public static void main(String[] args) {
        int n =66;
        System.out.println(isod(n));
    }
    static  public  boolean isod(int n){
        return (n & 1) ==1;
    }
}
