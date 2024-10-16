public class Scopeing {
    public static void main(String[] args) {
        int a = 12;
        int b = 12;

        //if some value initialized outside the box , then the value will be modified or change
        {
//          int a = 34;//it gives error because "a" is already used or initialized ,out side the same main() function,that's so why it can not initialized
            a = 23;//it not give error because the value will be modified
            int c= 123;
            //values initialized in this block ,will remaining in block
        }
//        System.out.println(c);//it gives error "c" is initialized a another block

        //Scoping in for loop
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
//        System.out.println(i);//it gives error Because "i" is out side the loop
    }
    static void random(){
//        System.out.println(a);//It gives error because compiler dose not know a ,Because this function is out of the main()
        int num=12;
        System.out.println(num);
    }
}
