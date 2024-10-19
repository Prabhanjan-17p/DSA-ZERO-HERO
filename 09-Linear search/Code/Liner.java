public class Liner {
    public static void main(String[] args) {
        /*
        //Time complexity
            As the size of input is growing,Then how many time is growing (to check ans), it's called as time complexity.
         */
        int[] nums ={12,34,43,1,22,-34,67};
        int target = 1;
        int ans = linearSearch(nums,target);
        System.out.println(ans);
    }
    //Search the Array:return the index if item found
    //If item not found return -1
    static int linearSearch(int[] arr,int target){
        if (arr.length==0){
            return  -1;
        }
        for (int index = 0; index < arr.length; index++) {
            //check for element at every index if it is = target
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        //this will be execute if none of the return statement above have executed
        //hence the target not found
        return -1;
    }
}
