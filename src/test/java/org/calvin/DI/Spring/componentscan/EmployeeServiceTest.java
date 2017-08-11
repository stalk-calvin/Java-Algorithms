package org.calvin.DI.Spring.componentscan;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeServiceTest {
    private AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
    private EmployeeService fixture;

    @Before
    public void setUp() {
        ctx.register(AppConfig.class);
        ctx.refresh();
        fixture = ctx.getBean(EmployeeService.class);
    }

    @Test
    public void shouldCheckAttendance() {
        assertEquals("I'm here", fixture.getEmployee().attendanceCheck());
    }

}