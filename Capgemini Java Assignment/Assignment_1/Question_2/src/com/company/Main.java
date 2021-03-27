package com.company;

public class Main {

    // find out all armstrong numbers that fall in between 100 - 999
    public static void main(String[] args) {
	// write your code here

        System.out.print("The Armstrong numbers are : ");
        for(int i = 100 ; i < 1000 ; i++)
        {
            int k = i;
            int sum =0;
            while(k>0)
            {
                int rem = k%10;
                sum += rem*rem*rem;
                k = k/10;
            }
            if(sum == i)
                System.out.print(i + " , ");

        }

    }
}
