package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,0,12,13,15,16);

        Consumer<List<Integer>> threadConsumer = M -> new Thread(() -> {
                M.forEach(System.out::println);
            }).start();

        threadConsumer.accept(numbers);
        }
}
