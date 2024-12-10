public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr ={1,2,5,7,9,12,34};
        System.out.println(bs(arr,12,0,arr.length-1));
    }
    static int bs(int[] arr,int target,int s ,int e){
        if (s > e){
            return -1;
        }

        int m = s + (e-s) /2;

        if (arr[m] == target){
            return m;
        }

        if (target < arr[m]){
//            e = m-1;
            return bs(arr,target,s,e-1);
        }

        return bs(arr,target,s+1,e);
    }
}
