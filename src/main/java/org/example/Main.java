package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Base base = null;
    }

    public static void testMethod(Base base){
        System.out.println(base.isFlag());
        System.out.println("testMethod");
    }
}