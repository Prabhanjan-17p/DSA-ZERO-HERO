public class Swap {
    public static void main(String[] args) {
        int a = 12;
        int b = 23;

        //1-
//        int temp = a;
//        a=b;
//        b=temp;
//        System.out.println(a+" "+b);

        //
        swap(12,23); // it dose not swap
        System.out.println(a+" "+b);
        
        //
        String name = "Pravanjan Amanta";
        changeName(name); // it's not return anything
        System.out.println(name); //it return the first name
    }

    //change name using function
     static void changeName(String name) {
        name = "kanha amanta"; //In this case it creating a new object (That's so why the value can not change)
         //And String arr "immutable"
    }

    //Same things doing in function
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        //this swap is only valid for this swap() only;
    }
}
