import java.util.ArrayList;
import java.util.Scanner;

public class MultiDArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        //Initialization  (if you not initialize then the value of every index is null)
        for (int i = 0; i < 3; i++) {
            lists.add(new ArrayList<>());
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                lists.get(i).add(sc.nextInt());
            }
        }
        System.out.println(lists);
    }
}
