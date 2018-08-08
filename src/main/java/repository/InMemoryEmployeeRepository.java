package repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class InMemoryEmployeeRepository implements EmployeeRepository {
    private Employee[] _employees;

    public InMemoryEmployeeRepository() {}

    public InMemoryEmployeeRepository(Employee[] employees) {
        _employees = employees;
    }


    @Override
    public List<Employee> getEmployees() {
        return Arrays.asList(_employees);
    }
}
