package org.billFarber.singleton;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private Integer counter = 0;

    private ThreadSafeSingleton() {
    }

    //synchronized method to control simultaneous access
    synchronized public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            // if instance is null, initialize
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    public Integer getValue() {
        return counter;
    }

    synchronized public Integer increment() {
        return ++counter;
    }
}
