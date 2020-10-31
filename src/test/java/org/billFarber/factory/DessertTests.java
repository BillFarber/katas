package org.billFarber.factory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DessertTests {

    @Test
    public void testPie() {
        assertEquals(Pie.NAME, DessertFactory.getSomethingBaked().getName());
    }

    @Test
    public void testIceCream() {
        assertEquals(IceCream.NAME, DessertFactory.getSomethingCreamy().getName());
    }
}
