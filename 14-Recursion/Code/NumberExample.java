/*
        VVI
            -- While the function is not finished executing it will remain in stack (main() is the 1st function staying in the stack)
            -- when a function finished exactly, it is removed from stack and the flow of program is restore to where the function is called
            -- And the memory working style is LIFO behave (in stack memory)
            -- main() first enter in the stack memory
 */


public class NumberExample {
    public static void main(String[] args) {
        // write a function to take  a number and print it
        //print first 5 number 1 2 3 4 5
        p1(1);
    }
    static void  p1(int n){
        System.out.println(n);
    }
}
