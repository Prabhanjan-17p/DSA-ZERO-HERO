public class PalindromNumber {
    public static void main(String[] args) {
        String str = "abcba";
        if (isPal(str)){
            System.out.println("It is palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
    static boolean isPal(String str){
        if (str == null || str.length() == 0 ){
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i <= str.length()/2; i++) {
            char st = str.charAt(i);
            char en = str.charAt(str.length()-1-i);

            if (st != en){
                return false;
            }
        }
        return true;
    }
}
