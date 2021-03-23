package com.company;

class Singleton
{
    private static Singleton instance = null;

    public String singleton;

    private Singleton()
    {
        singleton = "Hello , This is a Singleton class";
    }

    public static Singleton getInstance()
    {
        if(instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }

}



public class Main {

    // Singleton Class
    public static void main(String[] args) {
	// write your code here

        Singleton s = Singleton.getInstance();
        Singleton t = Singleton.getInstance();

        System.out.println(s.singleton);

        s.singleton = "here is the First Instance";

        System.out.println(s.singleton);

        t.singleton = "Override value on same instance";

        System.out.println(s.singleton);
    }
}
