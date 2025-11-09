package com.PraticeCode;

import java.util.ArrayList;
import java.util.List;

public class ToArray {
    public static void main(String[]args){
        ArrayList<Integer>l=new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        System.out.println(l);
        Integer[] i=l.stream().toArray(Integer[]::new);
        for(Integer i1:i){
            System.out.println(i1);
        }

    }
}
