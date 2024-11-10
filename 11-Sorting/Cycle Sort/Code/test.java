import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] ss ={2,3,4,4,5,5};
        int sum =0;
        for (int i = 0; i < ss.length; i++) {
            if (ss[i] < ss.length-1 && ss[i]!=ss[i+1]){
                ss[i] = ss[i];
            }
        }
//        System.out.println(Arrays);
        System.out.println(sum);
    }
}
