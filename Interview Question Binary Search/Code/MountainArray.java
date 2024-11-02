/*
    Mountain Array or Bi-tonic array
     arr[] ={1,2,3,5,7,6,3,2,1}
        --First increasing then decreasing this is called mountain array and bi-tonic array

            Qns - 0 1 0 - ams =1
                  0 2 1 0- ans = 2
                  1,2,5,2,1 ans = 5

            Solution
                1- arr[mid] > arr[mid+1] --> the start and end point are in decreasing order hence it checking the left hand side of arr[mid]
                        ex - arr[] ={1,2,3,5,7,6,3,2,}
                       arr[mid] = 3 --> 7
                       may be answer may be left side
                       the end = mid (because of it check {1,2,3,5,7} part
                2- arr[mid] < arr[mid+1] --> then the start and end point in increasing order then new start = mid+1 and end = end
                        ex - arr[] ={1,2,3,5,7,6,3,2,}
                       arr[mid] = 3 --> 7
                       may be answer may be right side
                       the start = mid+1 (because of it check {6,3,2,} part
                3- start == end --> then it will be answer
 */

public class MountainArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,5,7,6,3,2,};
        int ans = check(arr);
        System.out.println(ans);
        System.out.println(arr[ans]);
    }
    static  int check(int[] arr){
        int start =0;
        int end = arr.length-1;

        while (start < end ){
            int mid = start +(end-start)/2;

            if (arr[mid] > arr[mid+1]){
                //you are in decreasing part of an array
                // ths may be the answer may be left --> this is why end = mid-1
                end = mid;
            } else { // (arr[mid] < arr[mid+1])
                //you are in ascending  order of an array
                start = mid +1 ;
            }
        }
        //in the end , start == end and pointing to the largest number because of the 2 checks above
        //start end are always find max element in the above 2 case
        //hence , when they are pointing to just one element, that is the maximum because that tio check\

        return end;
//        return start;
    }
}
