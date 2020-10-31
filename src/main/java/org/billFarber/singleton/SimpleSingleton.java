package org.billFarber.singleton;

public class SimpleSingleton {
    private static SimpleSingleton INSTANCE;

    private Integer counter = 0;

    private SimpleSingleton() {
    }

    public static SimpleSingleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new SimpleSingleton();
        }

        return INSTANCE;
    }

    public Integer getValue() {
        return counter;
    }

    public Integer increment() {
        return ++counter;
    }
}
