package com.company;

public class DatabasePersistence extends Persistence{

    @Override
    void persist() {
        System.out.println("Database Persistence");
    }
}
