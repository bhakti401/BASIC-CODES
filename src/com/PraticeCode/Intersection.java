package com.PraticeCode;

import java.util.Arrays;
import java.util.List;

public class Intersection {
    public static void main(String[]args){

        List<Integer>l= Arrays.asList(4,7,8,3,9);
        List<Integer>l1=Arrays.asList(6,7,4,9,8);
        List<Integer>intersect=l.stream().filter(l1::contains).toList();
        System.out.println(intersect);
        
    }
}
