package com.company;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<Integer> A = new ArrayList<>();
        for(int i = 1 ; i < 15 ; i++)
        {
            A.add(i);
        }
        ListIterator<Integer> I = A.listIterator();

        System.out.print("Forward Sequence :  ");
        while(I.hasNext())
        {
            System.out.print(I.next()+" ");
        }
        System.out.println();
        System.out.print("Backward Sequence :  ");
        while(I.hasPrevious())
        {
            System.out.print(I.previous()+" ");
        }

    }
}
