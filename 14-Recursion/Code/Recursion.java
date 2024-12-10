/*
        What is Recursion
            -- When a function call it self called as recursion
            -- Base Condition => it is a condition where you stop the recursion
            -- No Base Condition => it's a infinite loop and it take more memory, then one time memory computer will exited the limit it is called stack overflow error

        Why Recursion
            -- It helps us in solving bigger complex problem in simple way
            -- You can convert recursion solution into iteration and vice versa
            -- Space complexity is not constant because of recursive call
            -- It helps us into breaking down bigger problem into small problem
            -- Visualising Recursion

        Recurrence Relation
            -- If a Recursion converted into a formula called is Recurrence Relation

        Variable In Recursion
            -- Argument
            -- Return type
            -- Body of function()
 */


public class Recursion {
    public static void main(String[] args) {
        // write a function to take  a number and print it
        //print first 5 number 1 2 3 4 5
        p1(1);
    }
    static void  p1(int n){
        if (n==5){              // Base Condition
            System.out.println(n);
            return;
        }
        System.out.println(n);  // Body part

        // Tail Recursion => one statement or end of statement
        p1(n+1);             //Recursive call -- Calling it self

    }
}
