/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.Spring;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.*;
import static org.mockito.Matchers.eq;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class SedanTest {
    @Autowired
    @Qualifier("sedan")
    private Sedan car;

    @Before public void setUp() throws Exception {
        assertThat(car, instanceOf(Sedan.class));
    }

    @Test public void shouldGetSize() throws Exception {
        assertThat(car.getSize(), is("Medium"));
    }

    @Test public void shouldGetNumberOfWheels() throws Exception {
        assertThat(car.getNumberOfWheels(), is(4));
    }

    @Test public void shouldGetColor() throws Exception {
        car.setColor("red");
        assertThat(car.getColor(), is("red"));

    }

}
