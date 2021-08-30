package org.calvin.DesignPatterns.Behavioral.NullObject;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {
    public static final Map<String, Car> allowedTypes =  new HashMap<String, Car>(){
        {
            put("SEDAN", new Sedan());
        }
    };
    public Car getCar(String type) {
        if (allowedTypes.containsKey(type.toUpperCase())) {
            return allowedTypes.get(type.toUpperCase());
        } else {
            return new NullCar();
        }
    }
}
