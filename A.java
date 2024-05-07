package com.ums;
import org.springframework.boot.autoconfigure.gson.GsonProperties;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class A {
    //predicate
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(10, 20, 34, 54, 45, 67, 66, 44, 78, 98);
        List<Integer> newData = data.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
        System.out.println(newData);
    }
}
