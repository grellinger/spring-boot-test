package api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.EmployeeService;

import java.util.List;

 @SpringBootApplication
 @RestController
 @RequestMapping("/api")
 @ComponentScan("service")
 public class EmployeeRestController {

    @Autowired
    private EmployeeService employeeService;

     public static void main(String[] args) {
         SpringApplication.run(EmployeeRestController.class, args);
     }

     @RequestMapping("/")
     public String index(){
         return "hello";
     }

    @GetMapping("/employees")
    public List<String> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
}
