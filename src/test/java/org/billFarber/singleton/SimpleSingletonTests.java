package org.billFarber.singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleSingletonTests {

    @Test
    public void testGet() {
        assertEquals((Integer) 0, SimpleSingleton.getInstance().getCounter());
    }

    @Test
    public void testIncrement() {
        assertEquals((Integer) 1, SimpleSingleton.getInstance().increment());
        assertEquals((Integer) 2, SimpleSingleton.getInstance().increment());
    }
}
