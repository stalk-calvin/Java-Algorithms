package org.calvin.DI.Spring.componentscan;

import org.springframework.stereotype.Component;

@Component
public class Employee {
    public String attendanceCheck() {
        return "I'm here";
    }
}