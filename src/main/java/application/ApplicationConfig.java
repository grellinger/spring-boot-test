package application;

import api.EmployeeResource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public EmployeeResource getEmployeeResource() {
        return new EmployeeResource();
    }
}
