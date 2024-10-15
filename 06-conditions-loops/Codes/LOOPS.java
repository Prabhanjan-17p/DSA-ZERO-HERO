import java.util.Scanner;

public class LOOPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //What is loop
        //Execute a process at several time that's called as loop
        //There are 3 types of loop 1-For loop
                                // 2-while loop
                                // 3- do while loop
        // ex- print 0 to 1000
        //for loop
        //when you know , the loop is how much running
        for (int i = 1; i <= 1000 ; i++) {
            System.out.println(i);
        }

        //print number as your choice ,means 1 to n
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++) {
//            System.out.println(i);
//        }


        //While loop
        //when you donot know , the loop is how much running
        int cc = 1;
        while (cc <= 5){
            System.out.println(cc);
            cc++;
        }

        //Do-While
        // When execute a process at lest one time
        int num =1 ;
        do{
            System.out.println("hello world!");
        }while (num !=1 );
    }
}
