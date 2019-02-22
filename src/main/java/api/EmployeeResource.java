package api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeResource {

    @GetMapping(value = "/employees")
    public ResponseEntity<String> doGet() {

        System.out.println("=========> getting :-)");

        return ResponseEntity.ok("employees");
    }
}
