package javabasics;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<Integer>();

        l.add(45);
        l.add(45);
        l.add(67);

        System.out.println(l);

        l.add(100);

        System.out.println(l);
        l.add(100);
        l.add(100);
        l.add(4,178);

        System.out.println(l);

        List <String> l2 = new ArrayList<String>();
        l2.add("aravinth");
        l2.add("abc");
        System.out.println(l2);
        l2.add(1,"xyz");

        for(String f:l2){
            System.out.println(f);
        }



    }
}
