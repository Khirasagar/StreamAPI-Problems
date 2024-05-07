package com.ums;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EndsWith {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("Emma","Johnson","Harry");
        List<String> newData =
                data.stream().filter(s -> s.endsWith("a"))
                .collect(Collectors.toList());
        System.out.println(newData);
    }
}
