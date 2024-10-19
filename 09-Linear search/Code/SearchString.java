public class SearchString {
    public static void main(String[] args) {
        String name="kanha";
        char target = 'h';
        System.out.println(search(name,target));
    }
    static boolean search(String str,char taget){
        if (str.length()== 0){
            return  false;
        }
        //Using Loop
        for (int i = 0; i < str.length(); i++) {
            if (taget == str.charAt(i)){
                return true;
            }
        }
        //or Using For Each Loop
        for (char ch:str.toCharArray()){
            if ( ch == taget){
                return true;
            }
        }
        return false;
    }
}
