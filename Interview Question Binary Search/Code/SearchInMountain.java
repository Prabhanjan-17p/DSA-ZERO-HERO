
/*
    Mountain Array or Bi-tonic array
     arr[] ={1,2,3,5,7,6,3,2,1} target = 3
     solution
        1- find the peak element
        2- then first search , asc order start =0 to end = peak
        3- if not found the target , then go to dec order start = peak+1 to end = arr.length-1
 */

public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr ={1,2,3,5,3,1};
        int target = 3;
        int ans = main(arr,target);
        System.out.println("index "+ans);
        System.out.println(arr[ans]);
    }

    static int main(int[] arr,int target){
        int peak = mountain(arr); // it return the peak element
        int firstTry = orderABS(arr,target,0,peak); // the element is stay in this array it return the answer
        if (firstTry != 0){
            return firstTry;
        }
        return orderABS(arr,target,peak+1,arr.length-1);
    }

    static  int mountain(int[] arr){
        int start =0;
        int end = arr.length-1;

        while (start < end ){
            int mid = start +(end-start)/2;

            if (arr[mid] > arr[mid+1]){
                //you are in decreasing part of an array
                // ths may be the answer may be left --> this is why end = mid-1
                end = mid;
            } else { // (arr[mid] < arr[mid+1])
                //you are in accesding  order of an array
                start = mid +1 ;
            }
        }
        return end;
//        return start;
    }

    static int orderABS(int[] arr ,int target ,int start ,int end ){

        //find whether the array is sorted in ascending or  descending
        boolean isAsc;
        if (arr[start] < arr[end]){
            isAsc = true;
        } else {
            isAsc = false;
        }

        while (start <= end) {
            // find the middle element
//            int mid = (start+end)/2; //might be possible that (start + end) exceeds the range of int in java (so in this case it will gives you error)
            int mid = start + (end-start)/2; // batter way to find mid value

            if (arr[mid] == target){
                return mid;
            }

            if (isAsc){
                if (target < arr[mid]){
                    end = mid-1;
                } else if (target > arr[mid]) {
                    start = mid+1;
                }
            } else {
                if (target > arr[mid]){
                    end = mid-1;
                } else if (target < arr[mid]) {
                    start = mid+1;
                }
            }

        }
        return  -1;
    }
}
