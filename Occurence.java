package com.ums;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//WAP to find how many times a word "mike" occured/exist in a given collection
public class Occurence {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("Mike","Soname","Egg","Mike");
        List<String> newData =
                data.stream().filter(s -> s.equals("Mike")) .collect(Collectors.toList());
        System.out.println(newData.size());
    }
}
