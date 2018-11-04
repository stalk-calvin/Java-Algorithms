/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Behaviorial.NullObject;

import static org.mockito.Matchers.startsWith;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.io.IOException;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ApplicationTest {

    private Application fixture;

    @Before
    public void setUp() {
        fixture = new Application(new NullPrintStream());
    }

    @Test
    public void shouldRedirectPrintToNullOutputStream() throws IOException {
        PrintStream ps = mock(PrintStream.class);
        System.setOut(ps);
        fixture.go();
        verify(ps).println(startsWith("sum"));
    }

}
