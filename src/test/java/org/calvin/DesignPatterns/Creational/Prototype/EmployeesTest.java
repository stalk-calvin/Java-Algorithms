/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Creational.Prototype;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.Lists;

public class EmployeesTest {
    private static final List<String> testData = Lists.newArrayList("Calvin","Lee");

    Employees fixture;

    @Before
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