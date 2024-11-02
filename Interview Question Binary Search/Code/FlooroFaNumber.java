/*
//Floor of a number
        The grater number smaller or = target
        if int[] arr ={2,3,5,9,14,16,18}; target =15;
        ans = 14
            the result arr is [] ={2,3,5,9,14}
            then the greatest number of this array is 14 , then 14 is the answer
            if number not found it return end
 */


public class FlooroFaNumber {
    public static void main(String[] args) {
        int[] arr ={2,3,5,9,14,16,18};
        int target=9;
        int ans = floor(arr,target);
        System.out.println(ans);
        System.out.println(arr[ans]);
    }
//    return the index = greatest number <= target
    static int floor(int[] arr,int target){
        int start =0,end = arr.length-1;

        while (start <= end){
            int mid = start+(end-start)/2;
            if (target < arr[mid]){
                end = mid-1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return end;
    }
}
