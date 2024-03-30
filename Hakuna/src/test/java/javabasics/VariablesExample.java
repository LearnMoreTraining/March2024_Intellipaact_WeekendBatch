package javabasics;

public class VariablesExample {
    double pie ; //global variable
    public void m1(){
        pie = 4.5;
        int a = 1 ; //local variable
        System.out.println(a);
        System.out.println(pie);
    }


    public void m2(){

        System.out.println(pie);
        int b= 10 ; //local varaible
    }
}
