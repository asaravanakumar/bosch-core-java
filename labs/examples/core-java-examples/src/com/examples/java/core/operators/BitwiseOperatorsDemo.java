package com.examples.java.core.operators;

public class BitwiseOperatorsDemo {
    public static void main(String[] args) {
        // Bitwise operators
        // & (bitwise and), | (bitwise or), ^ (bitwise XOR), ~ (bitwise compliment), << (left shift), >> (right shift), >>> (zero fill right shift)

        int a = 5; // 0101 in binary
        int b = 3; // 0011 in binary
        int result;

        // Bit-wise AND operation
        System.out.println("\n" + "Bit-wise operator example...");
        result = a & b; // 0001 in binary, which is 1
        System.out.println(result); // Output: 1

        // Bit-wise OR operation
        result = a | b; // 0111 in binary, which is 7
        System.out.println(result); // Output: 7

        // Bit-wise XOR operation
        result = a ^ b; // 0110 in binary, which is 6
        System.out.println(result); // Output: 6

        // Bit-wise NOT operation
        result = ~a; // 1010 in binary (for 32-bit system, this is -6 in decimal)
        System.out.println(result); // Output: -6

        // Left shift operation
        // This is equivalent to multiplying the number by 2^n (where n is the number of positions).
        result = a << 1; // 1010 in binary, which is 10
        System.out.println(result); // Output: 10

        // Right shift operation
        // This is equivalent to dividing the number by 2^n (where n is the number of positions). The sign bit is extended for signed numbers (arithmetic shift).
        result = a >> 1; // 0010 in binary, which is 2
        System.out.println(result); // Output: 2

        // Zero fill right shift operation
        // The unsigned right shift operator shifts bits to the right, but it fills the leftmost bits with zeros (it doesn't preserve the sign bit).
        a = -8; // 11111111111111111111111111111000 in binary (32-bit signed integer)
        result = a >>> 1; // 01111111111111111111111111111100 in binary
        System.out.println(result); // Output: 2147483642
    }
}
