package service;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class EmployeeService {
    public List<String> getAllEmployees() {

        String[] employees = { "Soujit", "Kieran", "Pinkesh", "Graham" };

        return Arrays.asList(employees);
    }
}

