package com.company;

import java.util.Objects;

public class Person{
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getWeight() == person.getWeight() && getHeight() == person.getHeight() && getName().equals(person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWeight(), getHeight(), getName());
    }
}
