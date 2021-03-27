package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code
        List<Orders> orders = Arrays.asList(new Orders(12000 , "Accepted")
        ,new Orders(8000 , "Completed")
        ,new Orders(12000 , "Completed")
        ,new Orders(9000 , "Accepted")
        ,new Orders(11000 , "Accepted")
        ,new Orders(15000 , "Completed"));

        Checker chk = (Orders O) -> O.getOrderPrice() > 10000;
        PrintConditionally(orders,chk);

    }
    public static void PrintConditionally(List<Orders> L , Checker checker )
    {
        for (Orders o : L)
        {
            if(checker.PriceCheck(o))
            {
                System.out.println(o);
            }
        }
    }

}


@FunctionalInterface
interface Checker
{
    Boolean PriceCheck(Orders o);
}


