import java.util.Scanner;

public class NastedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int empId = sc.nextInt();
        String depart = sc.next();

        switch (empId){
            case 1:
                System.out.println("Pravanjan Amanta");
                break;
            case 2:
                System.out.println("Kanha Amanta");
                break;

            case 3:
                System.out.println("Print employee number 3 : ");
                switch (depart){
                    case "it":
                        System.out.println("IT department");
                        break;
                    case "bio":
                        System.out.println("BIO department");
                        break;
                    default:
                        System.out.println("No found your department");
                }
                break;
            default:
                System.out.println("Please enter your correct id number");
        }
    }
}
