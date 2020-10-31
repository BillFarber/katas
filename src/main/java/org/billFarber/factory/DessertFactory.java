package org.billFarber.factory;

public class DessertFactory {
    public static Dessert getSomethingCreamy() {
        return new IceCream();
    }
    public static Dessert getSomethingBaked() {
        return new Pie();
    }
}
