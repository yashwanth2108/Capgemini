package com.company;

public class Person implements Comparable<Person> {
    int weight;
    int height;
    String name;

    public Person(int weight, int height, String name) {
        this.weight = weight;
        this.height = height;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        if(this.getWeight()>o.getWeight())
            return 1;
        else if(this.getWeight()==o.getWeight())
        {
            if(this.getHeight()>o.getHeight())
                return 1;
            else if(this.getHeight()==o.getHeight())
            {
                return 0;
            }
            else
                return -1;
        }
        else
            return -1;
    }
}
