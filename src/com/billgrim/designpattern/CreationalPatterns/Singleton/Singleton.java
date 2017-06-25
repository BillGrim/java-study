package com.billgrim.designpattern.CreationalPatterns.Singleton;

/**
 * Created by billgrim on 2017/6/25.
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }

    public void doSomething() {
        //do something
        System.out.println("This is a method of a singleton object.");
    }
}
