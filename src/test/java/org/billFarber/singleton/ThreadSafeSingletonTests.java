package org.billFarber.singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThreadSafeSingletonTests {

    @Test
    public void testGet() {
        assertEquals((Integer) 0, ThreadSafeSingleton.getInstance().getValue());
    }

    @Test
    public void testIncrement() {
        assertEquals((Integer) 1, ThreadSafeSingleton.getInstance().increment());
        assertEquals((Integer) 2, ThreadSafeSingleton.getInstance().increment());
        Integer interimValue = ThreadSafeSingleton.getInstance().getValue();
        interimValue++;
        assertEquals((Integer) 2, ThreadSafeSingleton.getInstance().getValue());
        assertEquals((Integer) 3, interimValue);
    }
}
