public class MaximumIteam {
    public static void main(String[] args) {
        int[] arr ={1,2,23,9,18};
        System.out.println(max(arr));
        System.out.println(maxRange(arr,0,3));
    }
    //imagine that arr is not empty
    //Find the bigger number in a Array
    static int max(int[] arr){
        //edge cases
        if (arr.length == 0){
            return -1;
        }
        int maxvalue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxvalue){
                maxvalue = arr[i];
            }
        }
        return maxvalue;
    }

    //find the maximum number in a given range
    static  int maxRange(int[] arr,int start,int end){
        //edge cases
        if (end > start){
            return -1;
        }
        if (arr==null){
            return -1;
        }
        int maxvalue = arr[start];
        for (int i = start; i <= end; i++) {
            if ( arr[i] > maxvalue){
                maxvalue = arr[i];
            }
        }
        return maxvalue;
    }
}
