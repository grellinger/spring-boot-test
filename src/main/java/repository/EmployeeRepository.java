package repository;

import org.springframework.stereotype.Repository;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> getEmployees();
}
