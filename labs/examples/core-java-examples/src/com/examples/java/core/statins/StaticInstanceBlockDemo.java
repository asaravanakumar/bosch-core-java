package com.examples.java.core.statins;

public class StaticInstanceBlockDemo {

    private int id;

    // static block
    static {
        System.out.println("Static Block called..");
    }

    // instance block
    {
        id = 100;
        System.out.println("ID: " + id);
        System.out.println("Instance Block called..");
    }

    public StaticInstanceBlockDemo() {
        System.out.println("Default Constructor called...");
    }

    public static void main(String[] args) {
        System.out.println("Static and Instance Block Demo!!!");
        StaticInstanceBlockDemo obj1 = new StaticInstanceBlockDemo();
        StaticInstanceBlockDemo obj2 = new StaticInstanceBlockDemo();
    }

}
