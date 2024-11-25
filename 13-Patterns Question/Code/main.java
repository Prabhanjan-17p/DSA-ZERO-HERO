import java.util.Scanner;
class kanha extends Exception{
    kanha(String name){
        super(name);
    }
}

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        try {
            System.out.println("Enter b value");
            b = sc.nextInt();
            System.out.println("Enter c value");
            c = sc.nextInt();
            if (b==1){
                throw new kanha("You not add b= 1");
//                throw new RuntimeException("You not add b= 1");
            }
            a = b/c;
            System.out.println("Answer = "+a);
            System.out.println("Enter a value");
        } catch (kanha e) {
            System.out.println("kanha error"+e);
        } catch (Exception e) {
            System.out.println("you can't divid by zero");
        }
    }
}
