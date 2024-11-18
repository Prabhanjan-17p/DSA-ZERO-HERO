public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char  ch = (char) ('a'+i);
            System.out.print(ch+" ");

            series = series + ch; //if one datatype is string all are converted into string // and it is changing the object
        }
        System.out.print(series);
    }
}
