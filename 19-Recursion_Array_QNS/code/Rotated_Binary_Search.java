public class Rotated_Binary_Search {
    public static void main(String[] args) {
        int arr[] = {5,6,7,8,9,1,2,3};
        int tar = 9;
        System.out.println(search(arr,tar,0,arr.length-1));
    }
    static int search(int[] arr,int tar , int s,int e){
        if (s > e){
            return -1;
        }
        int m = s+(e-s)/2;
        if (arr[m] == tar){
            return m;
        }
        if (arr[s] <= arr[m]){
            if (tar >= arr[s] && tar <= arr[m]){
                return search(arr,tar,s,m-1);
            }else {
                return search(arr,tar,m+1,e);
            }
        }

        if (tar >= arr[m] && tar <= arr[e]){
            return search(arr,tar,m+1,e);
        }else {
            return search(arr,tar,s,m-1);
        }
    }
}
