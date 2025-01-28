public class ArrayIsSorted {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6};
        System.out.println(sorted(arr,0));
    }
    static boolean sorted(int[] arr,int i){
        if (i == arr.length-1){
            return true;
        }

        //if modified a array in recursion call , it modified for all the recursion call
        return arr[i] < arr[i + 1] && sorted(arr,i+1);
    }
}
