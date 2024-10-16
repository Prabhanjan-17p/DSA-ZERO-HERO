import java.util.Arrays;

public class VarAgruments {
    public static void main(String[] args) {
        //Mean's variable length elements

        // it takes infinite arguments ,Because fun() is a varArg function
        //it will also take zero or more than zero element
        fun();
        fun(2,1,43,6,231,645,12);

        //multi type input
        multiple(23,13,"kanha","vari","prabhu");
    }
    // " ...var or ...example are called variable arguments" and take array of integers and collection of integer
//    static void fun(String ...var){ // String of array
//    static void fun(char ...var){ // char of array
    static void fun(int ...var){
        System.out.println(Arrays.toString(var));
    }

    //multiple input are accept here
    static void multiple(int a,int b,String ...v){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }

//    static void multiple(int a,String ...v,int k){} // this will be gives you error because VarArg are mostly in the last parameter
}
