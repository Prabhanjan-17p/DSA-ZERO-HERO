public class Shadowing {
    static int x=99; // it will be hide or shadowed at line 6
    public static void main(String[] args) {
        System.out.println(x);
//        int x =49; //Overlap the x (Because "x" is already declare the class scope)
        int x;
//        System.out.println(x);//it will gives error because it say " First initialized the x value "
        x=49;
        System.out.println(x);
        fun();
//        int x =23; //it also gives error
    }
    static void fun(){
        System.out.println(x);
    }
}
