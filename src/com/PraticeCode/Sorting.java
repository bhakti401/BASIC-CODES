package com.PraticeCode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sorting {
    public static void main(String[]args){
        List<Integer>l= Arrays.asList(3,6,5,94,45);
        System.out.println(l);
        List<Integer>asc=l.stream().sorted().toList();
        System.out.println(asc);
        List<Integer>desc=l.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(desc);
    }
}
