public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char  ch = (char) ('a'+i);
            System.out.print(ch+" ");

            builder = builder.append(ch); //in this case it is does not creating new new object , it changing the object
        }
        System.out.println(builder.toString());

//        builder.deleteCharAt(0);
//        builder.reverse();
//        System.out.println(builder);
    }
}
