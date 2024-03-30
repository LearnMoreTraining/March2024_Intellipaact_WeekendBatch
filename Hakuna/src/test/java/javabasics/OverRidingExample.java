package javabasics;

public class OverRidingExample extends SampleClass {

    public static void main(String[] args) {

        OverRidingExample a = new OverRidingExample();
        a.m1();
    }

    public void m1(){

        System.out.println("one");
    }
}
