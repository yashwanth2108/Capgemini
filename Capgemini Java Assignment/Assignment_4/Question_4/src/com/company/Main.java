package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<String> list = Arrays.asList("Hello World","Manav Verma","Johncena","Python","Manav","John","World");
        list.removeIf(l->l.length()%2!=0);
    }
}
