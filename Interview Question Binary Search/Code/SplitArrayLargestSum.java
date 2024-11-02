/*
        Split Array Largest Sum
            --It contain positive number only
            -- arr [] = {7,2,5,10,8} , m=2
            -- it can split like continues and non empty array
                    -- {7,2,5,10}  | {8}        -->  {7+2+5+10} =24 | {8}=8           => max=24
                    -- {7,2,5}     | {10,8}     -->  {7+2+5} =14    | {10,8}=18       => max=18
                    -- {7}         | {2,5,10,8} -->  {7} =7         | {2,5,10,8} = 25 => max=25
                            -- Then Output is all the maximum of lowest number is 18 , 18 is the answer
            -- minimum number of partition is 1
                    --ans is the array it self is a sub array {7,2,5,10,8}
            -- maximum number of partition is N
                    -- ans is the length of element in array means n
            -- maximum value of ans of question is = case 1
            -- minimum value of ans of question is = case 2

            -- arr [] = {7,2,5,10,8}
            --Minimum ans = max value in array --> in above ex ans is 10
            --Maximum ans = sum of all values in array  --> in above ex ans is 32
 */

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr= {7,2,5,10,8};
        int m =2;
        System.out.println(splitArray(arr,m));
    }

    static int splitArray(int[] arr ,int m){
        int start =0;
        int end =0;

        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start,arr[i]); // in the end of loop it can store the maximum number of na array
            end = end +arr[i];
        }

        //Now we apply binary search
        while (start < end){
            // Try for mid is the potential answer
            int mid = start +(end-start)/2;

            //calculate how many pieces you can divide this in with this max sum
            int sum =0;
            int pieces =1;

            for (int num : arr){
                if (sum + num > mid){
                    // you can not add this in this subarray , make new one
                    // say you add this num in new subarray , then sum =num
                    sum = num;
                    pieces++;
                } else {
                    sum = sum+num;
                }
            }

            if (pieces >= m) {
                start = mid+1;
            } else {
                end = mid;
            }
        }

        return end;
//        return start; //here start == end
    }
}
