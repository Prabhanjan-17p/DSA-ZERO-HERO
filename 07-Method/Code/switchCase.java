import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fruit = sc.next();
        switch (fruit) {
            case "apple" -> System.out.println("sweet red fruit");
            case "mango" -> System.out.println("king of fruit");
            case "orange" -> System.out.println("Round fruit");
            default -> System.out.println("not found.....");
        }

        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wen");
                break;
            case 4:
                System.out.println("The");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            default:
                System.out.println("Son");
                break;
        }

        switch (num){
            case 1,2,3,4,5 -> System.out.println("week Day");
            case 6,7-> System.out.println("Week End");
        }
    }
}
