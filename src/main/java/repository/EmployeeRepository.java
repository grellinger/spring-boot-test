package repository;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class EmployeeRepository {

    public List<Employee> getEmployees() {

        return Arrays.asList(new Employee("Kieran"), new Employee("Soujit"), new Employee("Graham"));
    }
}
