package com.PraticeCode;

import java.util.List;

public class StringList {
    public static void main(String[]args){
        List<String> names=List.of("ajay","aman","arav","char","bob");
        Long count=names.stream().filter(name->name.startsWith("a")).count();
        System.out.println(count);
    }
}
