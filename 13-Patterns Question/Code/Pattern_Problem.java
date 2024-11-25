/*
    -- How to approach --
            1- Number of line == Number of Rows == Number of time outer loop will run
            2- Identify for every rows number , how many column are there and type of element in column
            3- What do you need to print
            4- Try to find the formula relating role
 */


public class Pattern_Problem {
    public static void main(String[] args) {
//        pattern1(4);
//        pattern2(4);
//        pattern3(5);
//        pattern4(5);
//        pattern6(5);
//        pattern7(5);
//        pattern8(5);
        pattern9(5);
    }
//    static  void pattern1(int n){
//        //role-1 number of line == number of outer loop will run
//        for (int row = 1; row <= n; row++) {
//            //role-2 every row how many column are there rows==column
//            for (int col = 1; col <= row; col++) {
//                System.out.print("* ");
//            }
//            //when a row are print then add a new line
//            System.out.println();
//        }
//    }
//
//    static  void pattern2(int n){
//        System.out.println("QNS - 2");
//        //role-1 number of line == number of outer loop will run
//        for (int row = 1; row <= n; row++) {
//            //role-2 every row how many column are there
//            for (int col = 1; col <= n; col++) {
//                System.out.print("* ");
//            }
//            //when a row are print then add a new line
//            System.out.println();
//        }
//    }
//
//    static  void pattern3(int n){
//        System.out.println("QNS - 3");
//        //role-1 number of line == number of outer loop will run
//        for (int row = 1; row <= n; row++) {
//            //role-2 every row how many column are there
//            for (int col = 1; col <= n-row+1; col++) {
//                System.out.print("* ");
//            }
//            //when a row are print then add a new line
//            System.out.println();
//        }
//    }
//
//    static  void pattern4(int n){
//        System.out.println("QNS - 4");
//        //role-1 number of line == number of outer loop will run
//        for (int row = 1; row <= n; row++) {
//            //role-2 every row how many column are there
//            for (int col = 1; col <= row; col++) {
//                System.out.print(col+" ");
//            }
//            //when a row are print then add a new line
//            System.out.println();
//        }
//    }
//
//    static  void pattern5(int n){
//        System.out.println("QNS - 5");
//        //role-1 number of line == number of outer loop will run
//        for (int row = 0; row < 2 * n; row++) {
//            //role-2 every row how many column are there
//            int totColumnInEveryRow = row > n ? 2*n-row : row;
//            for (int col = 0; col < totColumnInEveryRow; col++) {
//                System.out.print("* ");
//            }
//            //when a row are print then add a new line
//            System.out.println();
//        }
//    }

    static  void pattern6(int n){
        System.out.println("QNS - 6");
        //role-1 number of line == number of outer loop will run
        for (int row = 0; row < 2 * n; row++) {
            //role-2 every row how many column are there
            int totColumnInEveryRow = row > n ? 2*n-row : row;

            int noOfSpace = n - totColumnInEveryRow;
            for (int s = 0; s < noOfSpace; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totColumnInEveryRow; col++) {
                System.out.print("* ");
            }
            //when a row are print then add a new line
            System.out.println();
        }
    }
    static  void pattern7(int n){
        System.out.println("QNS - 7");
        //role-1 number of line == number of outer loop will run
        for (int row = 1; row <= n; row++) {
            int space = n-row;
            for (int sa = 0; sa < space; sa++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col+" ");
            }
            //when a row are print then add a new line
            System.out.println();
        }
    }

    static  void pattern8(int n){
        System.out.println("QNS - 8");
        //role-1 number of line == number of outer loop will run
        for (int row = 1; row <= 2*n; row++) {
            int evRow = row > n ? 2*n-row : row;
            int space = n-evRow;
            for (int sa = 0; sa < space; sa++) {
                System.out.print("  ");
            }
            for (int col = evRow; col >= 1; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <= evRow; col++) {
                System.out.print(col+" ");
            }
            //when a row are print then add a new line
            System.out.println();
        }
    }

    static  void pattern9(int n) {
        System.out.println("QNS - 9");
        //role-1 number of line == number of outer loop will run
        int originalNum = n;
        n= 2*n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = originalNum - Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex + " ");
            }
            //when a row are print then add a new line
            System.out.println();
        }
    }

}
