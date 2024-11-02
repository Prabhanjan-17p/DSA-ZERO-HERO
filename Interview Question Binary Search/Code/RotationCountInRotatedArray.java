/*
    Rotation Count In Rotated Array
            -- Find who many time the array is rotated
            ex- arr[] ={4,5,6,7,0,1,2}
                solution
                    --{4,5,6,7} this is sorted asc
                    --{0,1,2} this is sorted Desc
                    --The pivot time will be array rotated
                    -- The original array {0,1,2,3,4,5,6,7}
                        -- 1st rotate {7,0,1,2,4,5,6}
                        -- 2nd rotate {6,7,0,1,2,4,5}
                        -- 3rd rotate {5,6,7,0,1,2,4}
                        -- 4th rotate {4,5,6,7,0,1,2}
                    --The pivot is 7 in index 3
                    --Then the array is rotated into (pivot + 1) =4
 */

public class RotationCountInRotatedArray {
    public static void main(String[] args) {
        int arr[] ={4,5,6,7,0,1,2};
        System.out.println(countRotation(arr));
    }

     static int countRotation(int[] arr) {
        int pivot = findPivot(arr);
//         if (pivot == -1) {
//             //if array is not rotated
//             return 0;
//         }
         return pivot+1;
    }
    static int findPivot(int[] arr){
        int start =0;
        int end = arr.length-1;

        while (start <= end){
            //4 cases over here
            int mid = start+(end-start)/2;

            if (mid < end && arr[mid] > arr[mid+1]){
                return  mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return -1;
    }

    //this is for duplicate value
    static int findPivotWithDuplicate(int[] arr){
        int start =0;
        int end = arr.length-1;

        while (start <= end){
            //4 cases over here
            int mid = start+(end-start)/2;

            if (mid < end && arr[mid] > arr[mid+1]){
                return  mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            //if element at middle,start,end are equal then just skip the duplicate
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                //skip the duplicate

                //Note--what if these element at start and end were the pivot?
                //check if start is pivot
                if (arr[start] > arr[start+1]){
                    return start;
                }
                start++;
                //check wheather end is pivot
                if (arr[end] < arr[end-1]){
                    return end-1;
                }
                end++;
            }
            //left side is sorted , so pivot should be in right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }
}
