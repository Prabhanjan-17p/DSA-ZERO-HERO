import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        //Syntax
        //The need of Array List is --> Actually it help to push unlimited element , they do not need to fixed the size
        ArrayList<Integer> list = new ArrayList<>();

        //unlimited data you can push here
        list.add(12);
        list.add(132);
        list.add(212);
        list.add(2);
        list.add(1);

        list.set(0,99);// it change the index[0] his value
        list.remove(2);//it remove the index 2

        System.out.println(list);

        //Input
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        //output-1
        for (int i = 0; i <5; i++) {
            System.out.println(list.get(i));
        }

        //output-2
        System.out.println(list);
    }
}
