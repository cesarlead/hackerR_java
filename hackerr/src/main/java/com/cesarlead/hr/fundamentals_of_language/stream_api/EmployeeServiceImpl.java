package com.cesarlead.hr.fundamentals_of_language.stream_api;

import java.util.List;
import java.util.Objects;

public class EmployeeServiceImpl implements EmployeeService {


    @Override
    public List<String> FilterNameBySalaryMoreThan(List<Employee> employees, double salary) {

        Objects.requireNonNull(employees, "employees cannot be null");

        return employees.stream()
                .filter(e -> e.salary() > salary)
                .map(e -> e.name().toUpperCase())
                .sorted()
                .toList();
    }
}
