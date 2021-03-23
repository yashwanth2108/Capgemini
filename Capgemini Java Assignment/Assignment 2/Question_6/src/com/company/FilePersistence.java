package com.company;

public class FilePersistence extends Persistence{


    // here is the updated one 
    @Override
    void persist() {
        System.out.println("File Persistence");
    }
}
