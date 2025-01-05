/*
    Number System
            --1. Decimal Number -> 0,1,2,---,9
                    => 357 base of 10
            --2. Binary Number => 0,1
                    => 357 base of 2
                    => 10 = 1 0 1 0
            --3. Octal Number => 0,1,2,---,7
                    => 357 base of 8
            --4. Hexadecimal Number => 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15(after 9-A,B,C,D,E,F)
                    => 357 base 16
            --5. Left Shift Operator ( << )
                    => It shifting to words the left
                    => a << 1 = 2a ( 10 << 1 = 20 )
                    => a << b = a * 2^b ( 2 << 4 = 2 * 2^4 )
            --6. Right Shift Operators ( >> )
                    => It shifting to words the right
                    => a >> b = a / 2^b ( 2 >> 4 = 2 / 2^4 )
                    => a >> 1 = a/2 ( 10 >> 1 = 5 )

            Conversation
                1-Decimal to Binary
                    -- Keep diving by base, take remainder write in opposite
                2- Binary to Decimal
                    -- Multiply and add the power of base with digit
 */

import java.util.Scanner;

public class NumberSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        System.out.println("num= "+num);
    }
}
