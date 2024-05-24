package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Base base = null;
    }

    public static void testMethod4NonEnsure(Base base, Base base2){
        if (base2 == null){
            System.out.println("base2 is null");
        }
        System.out.println(base2.isFlag());
        System.out.println("testMethod");
    }
}