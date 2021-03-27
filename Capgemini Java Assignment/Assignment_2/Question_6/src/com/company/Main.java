package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Persistence P = new Persistence() {
        @Override
        void persist() {
            System.out.println("It is a result of Persistence Class");
        }
    };
    P.persist();
    }
}
