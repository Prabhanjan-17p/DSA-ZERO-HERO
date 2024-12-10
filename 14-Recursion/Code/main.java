/*
    The main and important of this course is "RECURSION"
 */


public class main {
    public static void main(String[] args) {
        //WAF that print hello world
        msg();
        ee();
    }
    static  void msg(){
        System.out.println("hello world");
        msg1();
    }
    static void ee(){           // this part is run at the last in program
        System.out.println("ee");
    }
    static  void msg1(){
        System.out.println("hello world");
        msg2();
    }
    static  void msg2(){
        System.out.println("hello world");
        msg3();
    }
    static  void msg3(){
        System.out.println("hello world");
    }

}
