package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<String> list = Arrays.asList(
          "Hello","World","Java","C++","Python","Javascript","React"
        );
        list.replaceAll(String::toUpperCase);
        list.forEach(System.out::println);

    }
}
