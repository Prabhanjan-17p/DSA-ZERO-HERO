public class CountNumbers {
    public static void main(String[] args) {
        int x = 1231221;
        int count =0  ;
        while (x > 0){
            int rem = x%10;
            if ( rem == 2){
                count++;
            }
            x = x / 10;
        }
        System.out.println(count);
    }
}
