public class findUnique {
    public static void main(String[] args) {
        int[] arr = {2,3,3,4,2,6,4};
        System.out.println(ans(arr));
    }
    static int ans(int[] n){
        int unique =0;

        for (int i : n){
            unique ^= i;
        }

        return unique;
    }
}
