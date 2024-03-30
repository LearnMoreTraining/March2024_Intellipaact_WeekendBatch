package javabasics;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        Set<Integer> s = new HashSet<Integer>();
        s.add(1);
        s.add(1);
        s.add(1);
        s.add(2);

        System.out.println(s);

        for(int a:s){
            System.out.println(a);
        }
    }
}
