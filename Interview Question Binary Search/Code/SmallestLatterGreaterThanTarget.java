/*
       //Is That means Find first grater than the target all element , then his element of his small letter is the ans
                String[] arr = {"c","j","f"};
                String target = "a";
                        Ans - The greater of target element is {c,j,f}
                                Then the smallest of this element is c , then c is the answer
 */



public class SmallestLatterGreaterThanTarget {
    public static void main(String[] args) {
        char[] arr = {'c','j','f'};
        char target = 'a';
        char ans = SLGTT(arr,target);
        System.out.println(ans);
//        System.out.println(arr[ans]);
    }
    static char SLGTT(char[] arr,char target){
        int start=0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start +(end-start)/2;

            if (target < arr[mid]){
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return arr[start % arr.length];
    }
}
