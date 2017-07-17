package org.calvin.Annotations;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Method;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;

@Slf4j
public class SimpleTestTest {
    private SimpleTest fixture;

    @Before
    public void setUp() throws Exception {
        fixture = new SimpleTest();
    }

    @Test
    public void shouldReturnHello() throws Exception {
        printTestInfo("sayHello");
        assertEquals("hello", fixture.sayHello());
    }

    @Test
    public void shouldReturnUgly() throws Exception {
        printTestInfo("sayUgly");
        assertEquals("ugly", fixture.sayUgly());
    }

    private void printTestInfo(String methodName) throws NoSuchMethodException {
        Method m = fixture.getClass().getMethod(methodName);

        TestInfo testInfo=m.getAnnotation(TestInfo.class);
        log.info("\nTesting method: "+methodName);
        log.info("Author is: "+testInfo.author());
        log.info("Priority is: "+testInfo.priority().name());
        log.info("Last Chaged Date is: "+testInfo.lastChanged());
    }
}