public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {3,2,11}
        };
        System.out.println(Maxwealth(arr));
    }
    static int Maxwealth(int[][] acc){
        //person = row
        //account = column
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < acc.length; person++) {
            //when you start a new column ,take a new sum for that row
            int rowSum =0;
            for (int account = 0; account < acc[person].length; account++) {//it is going every column of each row
                rowSum += acc[person][account];
            }
            //Now we have sum of account of person
            //check with overall ans
            if (rowSum > ans){
                ans = rowSum;
            }
        }
        return ans;
    }
}
