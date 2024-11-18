/*
        String
                -- it is a collection of character
                -- String name = "kanha amanta" -> String - datatype , name - reference variable , "kanha amanta" - object
                -- String Pool = it is a separate memory structure inside the heap memory(because if someone creating same object name then it pointing this object)
                        -- string are immutable in java

 */

public class main {
    public static void main(String[] args) {
        int a = 10; // values are object , a and arr are reference variable , and int is data type
        int[] arr ={2,3,4,5}; // in this 2 case a, arr are 2 variable and which are store in stack memory and the value are store in heep memory and pointing to the variable a , arr

        //String
        String name = "kanha amanta"; //String - datatype , name - reference variable , "kanha amanta" - object
        System.out.println(name);

        String a1 = "kanha";
        System.out.println(a1);
        a1 = "amanta"; // it creating a new object
        System.out.println(a1);
    }
}
