package com.company;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main {

    public static void main(String[] args) {
	// write your code here

        LinkedHashSet<Integer> L = new LinkedHashSet<>();
        HashSet<Integer> H = new HashSet<>();
        int[] a = {5,3,2,1,6,11,7,13};
        System.out.print("Array Sequence : ");
        for (int j : a) {
            L.add(j);
            H.add(j);
            System.out.print(j+" ");
        }
        System.out.println();
        System.out.print("LinkedHashSet Sequence : ");
        L.forEach((k)->{System.out.print(k+" ");});
        System.out.println();
        System.out.print("HashSet Sequence : ");
        H.forEach((k)->{System.out.print(k+" ");});

    }
}
