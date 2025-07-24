package fundamentals_of_language;

import com.cesarlead.hr.fundamentals_of_language.stream_api.Employee;
import com.cesarlead.hr.fundamentals_of_language.stream_api.EmployeeService;
import com.cesarlead.hr.fundamentals_of_language.stream_api.EmployeeServiceImpl;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.UUID;

class EmployeeServiceTest {

    private final EmployeeService employeeService = new EmployeeServiceImpl();

    @Test
    void employeeServiceTest() {
        var arr = Arrays.asList(
                new Employee(UUID.randomUUID(), "jose", 4000.0),
                new Employee(UUID.randomUUID(), "daniel", 3000.0),
                new Employee(UUID.randomUUID(), "cesar", 5000.0),
                new Employee(UUID.randomUUID(), "francisco", 6000.0),
                new Employee(UUID.randomUUID(), "karli", 7000.0)
        );


        var employees = employeeService.FilterNameBySalaryMoreThan(arr, 3000.0);

        System.out.println(employees.toString());

        assert Arrays.deepEquals(employees.toArray(), new String[]{"CESAR", "FRANCISCO", "JOSE", "KARLI"});
    }
}
