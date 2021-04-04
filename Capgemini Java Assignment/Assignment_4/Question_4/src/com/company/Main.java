package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static List<String> removeIF(List<String> list)
    {
        list.removeIf(n -> n.length()%2!=0);
        return list;
    }


    public static void main(String[] args) {
	// write your code here
        List<String> list = new ArrayList<>(Arrays.asList("Hello World","Manav Verma","Johncena","Python","Manav","John","World"));
        list=removeIF(list);
    }
}
