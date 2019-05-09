package api;

import domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import service.EmployeeService;

@RestController()
public class EmployeeResource {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/employees/{employeeId}")
    public ResponseEntity<Employee> doGet(@PathVariable String employeeId) {

        Employee employee = this.employeeService.getEmployee(employeeId);

        return ResponseEntity.ok(employee);
    }
}
