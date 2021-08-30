package org.calvin.DesignPatterns.Behavioral.NullObject;

public interface Car {
    default void startEngine() {
        System.out.println("Start "+ getType()+" Engine!");
    }

    String getType();
}
