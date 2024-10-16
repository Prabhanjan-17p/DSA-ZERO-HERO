public class StringExample {
    public static void main(String[] args) {
        String massege = greet();
        System.out.println(massege);

        //Parameterized Function call
       int sum3 =  arguAdding(2,5);
        System.out.println("Sum of Parameterized function sum is = "+sum3);
    }
    static String greet(){
        System.out.println("RETURN TYPE IS STRING");
//        return 12; this will be show error because of this function the return type is String then you most be return a String
        return "12";
    }

    static int arguAdding(int a ,int b){
        int sum = a+b;
        return sum;
    }
}
