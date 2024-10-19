public class EvenDigit {
    public static void main(String[] args) {
        int[] arr ={12,322,4332,222,563566};
        System.out.println(findNumbers(arr));
    }
    //it is the main function call the user
    static  int findNumbers(int[] arr){
        int count =0;
        for (int nums : arr){
            if (even(nums)){
                count++; // if the even function return true then the count will be increase by 1
            }
        }
        return count;
    }
    //Function to check the number is even and how many even number
    static boolean even(int num){
        /*
        1- first count no of digit
        2- convert int to string to count the length
         */
        int numberOfDigit = digit(num);
        if (numberOfDigit %2 == 0){
            return true;
        }
//        return numberOfDigit % 2 == 0; // it is the enhance of the above code only one line of code
        return false;
    }
    //count the number of the digit
    static int digit(int num){
        //if the number is negative then it convert into +ve
        if (num < 0){
            num = num* -1;
        }
        if (num ==0 ){
            return 1;
        }
        int count =0;
        while (num > 0){
            count++;
            num = num/10;
        }
        return count;
    }
    //ways 2 to find number of digit
    static int digit2(int num){
        if (num < 0){
            num = num* -1;
        }
        return (int)(Math.log10(num));
    }

}
