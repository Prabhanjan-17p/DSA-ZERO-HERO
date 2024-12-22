/*
        What is Time Complexity
            -- Time complexity is != Time taken to run the program
            -- Time complexity is mathematical function
            -- It is a function that tell us how the time is growing to grow as input grow

    ** What do we consider when timing about Complexity
        1- Complexity always thing about worst case
        2- Always look at complexity for large data
        3-  3.1 Even the value of actual time is different they are all growing linearly
        3-  3.2 we don't care about actual time (because y=2x or y=3x or y=4x all are gives  linear)
        3-  3.3 We I goner all constant (because y=3x+5 it gives as same linear like)
        4- O(N^3 + log N) Always i goner less dominating terms (ex- if 1million data is => 1m^3 + log(1m) => 1m^3 + 6sec => that's so why 6sec is less as compare to 1m^3)
                ex- O(3N^3 + 4N^2 + 5N + 6)
                    --1st remove all constant
                    --O(N^3 + N^2 + N)
                    --2nd remove all dominates
                    --O(N^3)


        ** Big O - Notation
            -- Word Definition
                    -- O(N^3)=>This means this is the upper bound and it never exceed N^3 of time (means your algorithm is solved in N^2 ,may be N ,may be Log(N) , may be O(N^3) but not more than O(N^3))

        ** Big Omega Notation (Opposite of Big O of Notation)
            -- Word Definition
                    -- ω(N^3)=>This means at least N^3 time complexity(means above than N^3 but it can not lower than N^3)

        ** Theta Notation
            -- Word Definition
                    -- It means both Upper bound and lower bound
                    -- It is the combine of Big O Notation and Big Omega Notation

           QNS-What if an algorithm has lower bound and Upper bound as N^2
                -- O(N^2) & ω(N^2)


        ** Liitel O Notation
            -- Word Definition
                    -- This is also giving the upper bound
                    -- It is Strictly slower than g (if f = o(g))

        ** Liitel Omega Notation
            -- Word Definition
                    -- This is also giving the upper bound
                    -- It is faster than g (if f= ω(g))
 */


public class main {
    public static void main(String[] args) {

    }
}
