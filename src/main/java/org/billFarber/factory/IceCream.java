package org.billFarber.factory;

public class IceCream implements Dessert {
    protected static String NAME = "Pie";

    @Override
    public String getName() {
        return NAME;
    }
}
