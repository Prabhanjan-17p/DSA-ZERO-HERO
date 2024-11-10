/*
        Cyclic Sort
                --When given number's from range 1 to N used "Cyclic Sort" (important)
                --arr[] = {3,5,2,1,4}
                --After sorting then {1,2,3,4,5} , if value 1-N then index = value-1

                Solution
                    --arr[] = {3,5,2,1,4}
                    --1.1 check 1st element value == index of 1st (index = value-1) , if not then swap the correct index (mean value is 3 then the index will, value-1 => 3-1 => 2)
                    --1.2 if 1st element == 1st index , then move forward
                    --Note => every unique item check ones

                Worst Case
                    -- (N-1)+N => (2N-1) => O(N) , in time complicity we remove the constant
 */

public class Main {
    public static void main(String[] args) {

    }
}
