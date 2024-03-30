package javabasics;

public class AndExample {

    public static void main(String[] args) {

        int a = 15;

        if ( a > 0 && a <= 10){

            System.out.println( a * 2);
        }
        else if (a > 10 && a <= 15){

            System.out.println(a * 3);
        }
        else{

            System.out.println( a * 4);
        }

    }
}
