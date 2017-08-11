package org.calvin.DI.Spring.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private Employee employee;

    @Autowired
    public EmployeeService(Employee e) {
        employee = e;
    }

    public Employee getEmployee() {
        return employee;
    }
}