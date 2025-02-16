package com.wipro.java.designpattern.singleton.example.non_thread_safe;

//lazy loading
public final class Singleton1 {
    // The field must be declared volatile so that double check lock would work
    // correctly.
    private static volatile Singleton1 instance;

    public String value;

    private Singleton1(String value) {
        this.value = value;
    }

    public static Singleton1 getInstance(String value) {
    	
    	Singleton1 result=instance;
        if (result != null) {
            return result;
        }
        synchronized(Singleton1.class) {
            if (instance == null) {
                instance = new Singleton1(value);
            }
            return instance;
        }
    }
}