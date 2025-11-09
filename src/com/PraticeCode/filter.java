package com.PraticeCode;

import java.util.Arrays;
import java.util.List;

public class filter {
    public static void main(String[]args){
        List<Integer> l= Arrays.asList(3,6,5,9,4,6);
        List<Integer> l1=l.stream().filter(i->i%2==0).toList();
        System.out.println(l1);
    }
}
