package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] a = { 5 , 12 , 14 , 6 , 78 , 19 , 1 , 23 , 26 , 35 , 37 , 7 , 52 , 86 , 47 };
        int i, j;
        for (i = 0; i < 15; i++) {
            for (j = 0; j < 15 - i - 1; j++)
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
        }
        for(i = 0 ; i < 15 ; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
