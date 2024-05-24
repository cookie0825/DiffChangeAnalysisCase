package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Base base = null;
    }

    public static void testMethod4NonEnsure(Base base, Base base2, Base base3){
        if (base3 == null){
            System.out.println("base3 is null");
            return;
        }
        System.out.println(base3.isFlag());
        System.out.println("testMethod");
    }
}