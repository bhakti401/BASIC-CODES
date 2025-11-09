package com.PraticeCode;

import java.util.Arrays;
import java.util.List;

public class mapdemo {
    public static void main(String[]args){
        List<Integer>l= Arrays.asList(3,5,8,9,23);
        System.out.println(l);
        List<Integer> l1=l.stream().map(i->i+5).toList();
        System.out.println(l1);

    }
}
