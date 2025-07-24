package com.cesarlead.hr.fundamentals_of_language.stream_api;

import java.util.List;

public interface EmployeeService {
    List<String> FilterNameBySalaryMoreThan(List<Employee> employees, double salary);
}
