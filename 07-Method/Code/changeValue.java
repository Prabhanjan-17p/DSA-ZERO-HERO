import java.util.Arrays;

public class changeValue {
    public static void main(String[] args) {
        //Creating a Array
        int [] arr={1,3,2,45,6};
        //when a object reference passed to this parameter actually reference it self passed by called by value,Because The value that become passed to this object
        //means the above example "arr" is a object of array class ,Then the "arr" passed into reference as a value not reference variable
        //in java do not have pointer
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    //"nums" ==> copy of the value of the reference
    static void change(int[] nums){
        nums[0]=99; //if you make to change to the object via this same object will change
    }
}
