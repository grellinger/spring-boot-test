package api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.Employee;
import service.EmployeeService;

import java.util.List;

 @SpringBootApplication
 @RestController
 @RequestMapping("/api")
 @ComponentScan(basePackages = {"service", "repository"})
 public class EmployeeRestController {

    @Autowired
    private EmployeeService employeeService;

     public static void main(String[] args) {
         SpringApplication.run(EmployeeRestController.class, args);
     }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
}
