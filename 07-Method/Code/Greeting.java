import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        greeting();

        String msg = myGreet("Pravanjan Amanta");
        System.out.println(msg);


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name sir! : ");
        String name = sc.nextLine();
        String nn = enterAndSay(name);
        System.out.println(nn);
    }

    private static String myGreet(String name) {
        String mm="hello "+name;
        return  mm;
    }
    private static String enterAndSay(String name) {
        String mm="hello "+name;
        return  mm;
    }

    static void greeting() {
         System.out.println("Hello");
    }
}
