public class Arrays {
    public static void main(String[] args) {
        //Why we need Arrays

        //store a roll Number
        int roll1 = 45;
        //store names
        String name1 = "kanha amanta";

        //Store 1000 Roll Number (That's so why need a Arrays)
        /*
        --Array are start with "0" index
        --If you declare it is int only int value are you can enter as well as other datatype
        -- 1 - Array object are in heap
        -- 2 - Heap object are not continues
        -- 3 - Array Dynamic Memory Allocation (Means object are create in run time
        Hence -- May not be continues --> Depends on JVM
        -- new - it is a keyword , the use of new is creating new object in heap memory
        -- If you do not want new keyword used then you declare like this -- {value1, value2,value3,......} (direct assign the value)
        --In Array each particular elements and value are object
        -- each object are store in different memory
        //Syntax
        datatype[] variable name = new datatype[size]
        datatype[] variable_name = {value1,value2,value3..........}
        datatype[] variable_name ;
         */
        //1
        int [] RollNUmber =new int[6];
        RollNUmber[0] =12;
        RollNUmber[1] =5;
        RollNUmber[2] =4;
        RollNUmber[3] =3;
        RollNUmber[4] =2;
        RollNUmber[5] =1;
        System.out.println(RollNUmber[3]);
        //2
        String[] name = {"kanha", "rama","hari","sudam"};
        System.out.println(name[2]);
        //3
        int[] id; // declaration of array "id" are getting define in stack
        id = new int[3];// Initialisation actually here object is being created in the memory (heap)
        //4
        String[] arr = new String[1];
        System.out.println(arr[0]);


        /*
            Note--> All the Primitive are store in the stack memory
                    And all the other object are store in heap memory
         */

        //NULL
        //Any reference variable by default it's null type
        //Null are not define in primitive datatype ,only declare in non primitive type
//        null a = null; // can not create
        String sa = null; //(because it is a non-primitive datatype) that's so it can decalre null value
//        int ssa = null; // it gives error (because it is a primitive datatype)
    }
}
