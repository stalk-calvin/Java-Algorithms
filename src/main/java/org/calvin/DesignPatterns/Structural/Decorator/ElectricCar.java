package org.calvin.DesignPatterns.Structural.Decorator;

public class ElectricCar extends ElectricityDecorator {
    public ElectricCar(Car c) {
        decoratedFrom = c;
        description = "Electric";
    }

    @Override
    public String assemble(){
        super.assemble();
        System.out.print(" -> Adding features of Electric Car");
        return description + " Car";
    }

    @Override
    public String getDescription() {
        return decoratedFrom.getDescription() + ", " + description;
    }

    @Override
    public double cost() {
        return 50000.00 + decoratedFrom.cost();
    }
}
