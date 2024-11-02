/*
        Search In Rotated Sorted Array
        arr[] = {2,4,5,7,8,9,10,12}
        after 1 rotation
            = {12,2,4,5,7,8,9,10,}
           2 rotation
              = {10,12,2,4,5,7,8,9}

        Solution
                1- Find the pivot in the array (means largest)
                    1.1--pivot = arr[mid] > arr[mid+1]
                    1.2--pivot = arr[mid] < arr[mid-1]
                    1.3--pivot = start element >= mid elements
                            =arr[] = {4,5,6,3,2,1,0}
                            --{3,2,1,0} will always smaller than {4,5,6}
                            -- hence end = mid-1
                    1.4--start element < mid element
                            =arr[] = {3,4,5,6,2}
                            (means 3 < 5)
                            -- then start = mid +1

                    ex ={3,4,5,6,7,0,1,2}
                            -- {3,4,5,6,7} this asc
                            -- {0,1,2} this is also asc
                            then the pivot is "7"
                2- then check the 1st asc array start =0 and end = pivot
                3- if not found 1st asc array then check 2nd asc array
 */

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr =  {4,5,6,3,2,1,0};
        int target = 3;
        System.out.println(search(arr,target));
    }

    static int search(int[] nums,int target){
        int pivot = findPivot(nums);

        //if you did not find a pivot , it means the array is not rotated
           /*
                //if pivot is found you have found 2 asc sorted array
                arr[] = {4,5,6,7,0,1,2} //s=4 e=2 p=7
                    there are 3 case are archive
                    1.1 -- pivot element == target // it is the ans
                    1.2 -- target element > start element // let you search for 6
                            search space = (start , pivot -1) // because of after the pivot all the element are smaller than start
                    1.3 -- target < start element // in this case after start element to the pivot element all the element are bigger than pivot
                            search space = (pivot+1 , end)
         */

        if (pivot == -1){
            //just do noram search
            return binarySearch(nums,target,0,nums.length-1);
        }
        if (nums[pivot] == target) {
            return pivot;
        }
        if (target == nums[0]) {
            return  binarySearch(nums,target,0,pivot-1);
        }
        return binarySearch(nums,target,pivot+1,nums.length-1);
    }

    static int binarySearch(int[] arr,int target,int start,int end){
        while (start <= end){
            int mid = start +(end-start)/2;

            if (target < arr[mid]){
                end = mid-1;
            } else if (target > arr[mid]){
                start = mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    //this is not for duplicate value
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
