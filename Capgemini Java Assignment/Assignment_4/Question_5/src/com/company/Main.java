package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<String> s = Arrays.asList("Hello","World","Java","C++","Python","Javascript");

        AtomicReference<String> T = new AtomicReference<>("");

        Consumer<List<String>> result = N -> {
          for(String S : N)
          {
              StringBuilder l = new StringBuilder(S);
              T.updateAndGet(v -> v + l.charAt(0));
          }
        };
        result.accept(s);
        System.out.println(T);
    };
}
