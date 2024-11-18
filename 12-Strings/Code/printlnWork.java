import java.util.Arrays;

public class printlnWork {
    public static void main(String[] args) {

        //1- calling the valueof()
        //2- valueof() calling the toString()
        //3- then returning a string

        System.out.println(12);
        System.out.println("kanha");
        System.out.println(new int[] {1,3,4,5}); // it giving the garbage  value
        System.out.println(Arrays.toString(new int[] {1,3,4,5})); // in this case it calling the own toString() that so why it giving output


        String b = "name";
        int a = 12;

    }
}
