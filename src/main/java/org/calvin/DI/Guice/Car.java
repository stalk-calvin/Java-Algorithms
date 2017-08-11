package org.calvin.DI.Guice;

import com.google.inject.Inject;
import com.google.inject.AbstractModule;
import lombok.Getter;

public class Car {
    public String doSomeThing() {
        return "Print SOMETHING";
    }
}

class EngineService {
    @Getter
    private Car car;

    @Inject
    public EngineService(Car car) {
        this.car = car;
    }

    public String doSomeThing() {
        return "Print something";
    }
}

class CarModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Car.class);
    }
}