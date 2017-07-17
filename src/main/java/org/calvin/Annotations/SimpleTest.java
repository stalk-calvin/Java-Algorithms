package org.calvin.Annotations;

import org.calvin.Annotations.TestInfo.Priority;

public class SimpleTest {
    @TestInfo(description = "return hello string", lastChanged = "2017-07-16")
    public String sayHello(){ return "hello"; }

    @TestInfo(description = "return ugly string", lastChanged = "2017-07-16", author = "James", priority = Priority.MEDIUM)
    public String sayUgly() { return "ugly"; }
}