package com.examples.java.core.operators;

public class OperatorsDemo {
    public static void main(String[] args) {
        // Operators

        // Arithmatic operators: +, -, *, /, %, ++, --
        // Relational operators: ==, !=, >, <, >=, <=
        // Logical operations: &&, ||, !
        // Bitwise operators: &, |, ^, ~, <<, >>, >>>
        // Assignment operators: =, +=, -=, *=, /=, %=, <<=, >>=, &=, ^=, |=
        // Conditional operator: (expr) ? value if true : value if false
        // instanceOf => ( Object reference variable ) instanceof (class/interface type)

        int a = 10;
        int b = 20;

        System.out.println("\n" + "Ternary operator example...");
        System.out.println(a == b ? "a and b are equal" : "a and b are not equal");

        String name = "Java";
        System.out.println(name instanceof  String);
    }
}
