import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "kanha amanta";
        System.out.println(Arrays.toString(name.toCharArray()));

//        name = name.toUpperCase(); // in this case creating a new object
        System.out.println(name.toUpperCase()); // instance
        System.out.println(name); // original // do not change in original because String are immutable

        System.out.println(name.indexOf('a'));
    }
}
