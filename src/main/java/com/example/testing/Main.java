package com.example.testing;

public class Main {

    public static void main(String[] args) {
        Math m = new Math();
        System.out.println(m.printHello());
        int firstResult = m.doMath(5,6);
        int secondResult = m.multiplyBy5(firstResult);
        System.out.println(firstResult);
        System.out.println(secondResult);
    }
}
