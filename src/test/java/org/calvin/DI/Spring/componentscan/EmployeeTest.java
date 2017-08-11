package org.calvin.DI.Spring.componentscan;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeTest {
    private AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
    private Employee fixture;

    @Before
    public void setUp() {
        ctx.register(AppConfig.class);
        ctx.refresh();
        fixture = ctx.getBean(Employee.class);
    }

    @Test
    public void shouldCheckAttendance() {
        assertEquals("I'm here", fixture.attendanceCheck());
    }

}