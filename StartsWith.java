package com.ums;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StartsWith {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("mike","adam","stallion","muse","mandy");
        List<String> newData = data.stream().filter(s->s.startsWith("m"))
                .collect(Collectors.toList());
        System.out.println(newData);

    }
}
