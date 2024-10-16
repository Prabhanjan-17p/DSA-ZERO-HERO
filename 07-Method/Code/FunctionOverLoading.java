public class FunctionOverLoading {
    public static void main(String[] args) {
        fun();
        sum(12,32);

        //In Overload function a VarArg function can not be empty
//        demo(); //It's called "Ambiguity"
    }

    //If 2 or more Same Function But different parameter this is called function overloading
    //At the compile time it will decide to which program or function will be run
    static void fun(){
        System.out.println("without parameter function");
    }
    static void fun(String name){
        System.out.println("With parameter function");
    }
    static void demo(String ...v){
        System.out.println("String--With parameter function");
    }
    static void demo(int ...var ){
        System.out.println("Int--With parameter function");
    }
    static void sum(int num1 ,int num2){
        int summ = num1+num2;
        System.out.println("2 Number Sum ="+summ);
    }
    static void sum(int num1 ,int num2,int num3){
        int summ = num1+num2+num3;
        System.out.println("3 Number of Sum ="+summ);
    }
}
