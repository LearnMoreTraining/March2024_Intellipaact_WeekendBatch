package javabasics;

public class ArrayExample {

    public static void main(String[] args) {

        int [] numbers = {45,78,90,100}; //0,1,2,3 //lenght - 4
        String [] name = {"apple","learnmore"} ; //0,1

        for(int a = name.length;  a > name.length ; a--){

            System.out.println(name[a]);
        }

        System.out.println(numbers[3]);
        System.out.println(name[1]);

        for (int k=0; k <numbers.length; k++){

            System.out.println(numbers[k]);
        }

// 0 < 4 - true
//1 < 4 - true
    }

}
