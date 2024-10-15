public class ReversOfTheNumber {
    public static void main(String[] args) {
        int x = 2130329;
        int num =0 ;
        int cou=0;
        while (x > 0){
            int rem = x % 10; // it gives reminder part
            x = x / 10; // it gives content part

            num = num * 10 +rem;
        }
        System.out.println(num);
    }
}
