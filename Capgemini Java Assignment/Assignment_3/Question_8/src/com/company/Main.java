package com.company;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // HashMap Fail Fast

        Map<String, String> Capitals = new HashMap<>();
        Capitals.put("Moscow", "Russia");
        Capitals.put("New York", "USA");
        Capitals.put("Delhi", "India");

        Iterator iterator = Capitals.keySet().iterator();

        try {
            while (iterator.hasNext()) {
                System.out.println(Capitals.get(iterator.next()));
                Capitals.put("Istanbul", "Turkey");
            }
        }
        catch (ConcurrentModificationException e)
        {
            System.out.println("ConcurrentModificationException");
        }

        // ArrayList Fail Fast

        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);

        Iterator<Integer> itr = al.iterator();
        while (itr.hasNext()) {
            if (itr.next() == 2) {
                // will not throw Exception
                itr.remove();
            }
        }

        System.out.println(al);

        itr = al.iterator();
        try
        {
            while (itr.hasNext()) {
                if (itr.next() == 3) {
                    // will throw Exception on
                    // next call of next() method
                    al.remove(3);
                }
            }
        }
        catch(ConcurrentModificationException e)
        {
            System.out.println("ConcurrentModificationException");
        }

        // Vector Fail Fast

        Vector<Integer> v = new Vector<>();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);

        itr = v.iterator();
        while (itr.hasNext()) {
            if (itr.next() == 2) {
                // will not throw Exception
                itr.remove();
            }
        }

        System.out.println(v);

        itr = al.iterator();
        try
        {
            while (itr.hasNext()) {
                if (itr.next() == 3) {
                    // will throw Exception on
                    // next call of next() method
                    v.remove(3);
                }
            }
        }
        catch(ConcurrentModificationException e)
        {
            System.out.println("ConcurrentModificationException");
        }

        // CopyOnWriteArrayList Fail Safe

        CopyOnWriteArrayList<Integer> list
                = new CopyOnWriteArrayList<>(new Integer[]{1, 3, 5, 8});
        itr = list.iterator();
        while (itr.hasNext()) {
            Integer no = itr.next();
            System.out.println(no);
            if (no == 8)

                // This will not print,
                // hence it has created separate copy
                list.add(14);
        }

        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        map.put("ONE", 1);
        map.put("TWO", 2);
        map.put("THREE", 3);
        map.put("FOUR", 4);

        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));

            // Hence, it has not created separate copy
            map.put("SEVEN", 7);
        }

    }
}
