import java.util.ArrayList;

public class operators {
    public static void main(String[] args) {
        System.out.println('a'+'b'); //ASCII value adding

        System.out.println("a"+"b"); //it concatenate the string

        System.out.println("a"+3); //it concatenate the string //3 is integer will be converted into Integer that will call toString // then lastly is "a"+"3" = a3

        System.out.println('a'+3); //ASCII value + 3

        System.out.println((char) ('a'+3)); //ASCII value + 3=100 which is type cast into character = d

        System.out.println("kanha"+new ArrayList<>()); // array list is empty which is return []

        System.out.println("kanha" + new Integer(34)); //it is convert into string

//        System.out.println(new Integer(23) + new ArrayList<>()); // it will give you error ,in this case there are no string // so a integer can not add a array
        System.out.println(new Integer(23) + ""+ new ArrayList<>()); // it will not  give you error, because at-least one string most be there // lastly it convert into string
    }
}
