package org.calvin.DI.Guice;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Before;
import org.junit.Test;

public class CarTest {
    private Injector injector = null;

    @Before
    public void setUp() {
        injector = Guice.createInjector(new CarModule());
        assertThat(injector, is(not(nullValue())));
    }

    @Test
    public void testGetEngineService() {
        EngineService engineService = injector.getInstance(EngineService.class);
        assertThat(engineService, is(not(nullValue())));
        assertEquals("Print something", engineService.doSomeThing());
        assertEquals("Print SOMETHING",engineService.getCar().doSomeThing());
    }

    @Test
    public void testGetCar() {
        Car car = injector.getInstance(Car.class);
        assertThat(car, is(not(nullValue())));
        car.doSomeThing();
    }
}
