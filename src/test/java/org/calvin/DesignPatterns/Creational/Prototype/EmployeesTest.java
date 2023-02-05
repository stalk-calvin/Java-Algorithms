/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Creational.Prototype;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeesTest {
    private static final List<String> testData = Lists.newArrayList("Calvin","Lee");

    Employees fixture;

    @BeforeEach
    public void setUp() {
        fixture = new Employees(testData);
    }

    @Test
    public void shouldGetEmployeeList() {
        List<String> expected = Lists.newArrayList("Calvin","Lee");
        assertEquals(expected, fixture.getEmpList());
    }

    @Test
    public void shouldCloneEmployeeList() throws CloneNotSupportedException {
        List<String> expected = Lists.newArrayList("Calvin","Lee");
        Employees actual = (Employees) fixture.clone();
        assertEquals(expected, actual.getEmpList());
    }

}
