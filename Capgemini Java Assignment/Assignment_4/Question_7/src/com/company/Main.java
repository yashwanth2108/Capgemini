package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,2);
        map.put(3,4);
        map.put(5,6);
        map.put(7,8);
        map.put(9,10);
        map.put(11,12);
        map.put(12,14);


        AtomicReference<String> s = new AtomicReference<>("");

        Consumer<Map<Integer, Integer>> result = (mp) -> {
            StringBuilder S = new StringBuilder();
            for(Map.Entry<Integer,Integer> m : mp.entrySet())
            {
                S.append("" + m.getKey());
                S.append(" -> "+m.getValue()+"   ");
            }
            s.updateAndGet(l->l+S);
        };
        result.accept(map);
        
        System.out.println(s);
    }
}
