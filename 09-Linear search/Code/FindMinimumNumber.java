public class FindMinimumNumber {
    public static void main(String[] args) {
        int[] arr = {12,21,-45,64,-54,78,3};
        System.out.println(min(arr));
    }
    //Return thr minimum value in the array
    static int min(int[] arr){
        int minimum= arr[0] ;
        for (int i = 0; i < arr.length; i++) {
            if (minimum > arr[i]){
                minimum = arr[i];
            }
        }
        return minimum;
    }
}
