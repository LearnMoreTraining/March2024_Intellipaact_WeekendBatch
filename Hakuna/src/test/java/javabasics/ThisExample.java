package javabasics;

public class ThisExample extends DemoClass {

    int a = 23;
   final double pie = 3.14;

    public static void main(String[] args) {

        ThisExample t = new ThisExample();
        t.m1();
    }
    public void m1(){

        int a = 1;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }

}
