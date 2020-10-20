package org.billFarber.singleton;

public enum ThreadSafeSingleton {

    INSTANCE(0);

    private Integer counter;

    private ThreadSafeSingleton(Integer counter) {
        this.counter = counter;
    }

    public ThreadSafeSingleton getInstance() {
        return INSTANCE;
    }

}
