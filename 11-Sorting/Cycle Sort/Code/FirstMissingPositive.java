public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {1,2,0};
//        sort(arr);
        System.out.println(sort(arr));
    }
    static int sort(int[] arr){
        int i=0;
        while (i <arr.length) {
            int correctI = arr[i]-1;
            if ( arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctI]){
                swap(arr,i,correctI);
            } else {
                i++;
            }
        }
        //search the missing element
        //case-1
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j+1){
                return j+1;
            }
        }

        //case-2
        return arr.length+1;
    }
    static void swap(int[] arr , int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp ;
    }
}
