public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {12,21,34,31,56,78,43,9};
        int target =21 ;
        int start=1 , end=3;
       int ans = searchRange(arr , target,start,end);
        System.out.println(ans);

    }
    static int searchRange(int[] arr , int target,int start , int end){
        if (arr.length == 0){
            return -1;
        }
        for (int i = start; i <= end; i++) {
            int ele = arr[i];
            if (target == ele){
                return 1;
            }
        }

        return -1;
    }
}
