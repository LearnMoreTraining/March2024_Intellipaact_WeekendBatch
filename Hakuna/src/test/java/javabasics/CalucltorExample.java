package javabasics;

public class CalucltorExample {


    public static void main(String[] args) {

        int a = 10;
        int b = 56 ;
        char f = '5';

        if (a == b){

        }

        String operator = "-";

        if(operator.equals("+")){
            System.out.println(a+b);
        }
        else if(operator.equals("-")){

            if (a > b){

                System.out.println(a - b);
                System.out.println("hello");
            }
            else{
                System.out.println(b-a);
            }

        }
        else if(operator.equals("*")){
            System.out.println(a * b);
        }
        else if(operator.equals("/")){

            if (a == 0 || b == 0){

                System.out.println("enter non zero number");
            }
            else{
                System.out.println(a / b);
            }
        }
        else{
            System.out.println("enter valid operator");
        }

    }
}
