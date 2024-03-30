package javabasics;

public class PolyMorphismExample {

    public static void main(String[] args) {

        PolyMorphismExample p = new PolyMorphismExample();
        p.m1("lmti",45);

    }


    public void m1(int a){

        System.out.println(a);
    }

    public void m1(String a){

        System.out.println(a);
    }

    public void m1(int a, int b){

        System.out.println(a);
        System.out.println(b);
    }

    public void m1(String a, int b){

        System.out.println(a);
        System.out.println(b);
    }
}
