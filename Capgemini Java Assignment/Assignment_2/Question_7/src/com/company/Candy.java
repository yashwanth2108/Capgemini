package com.company;

public class Candy extends DesertItem{
    int cost = 50;
    @Override
    int getCost() {
        return cost*60;
    }
}
