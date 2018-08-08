package repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=InMemoryEmployeeRepository.class)
public class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void pass() {
        assertThat(true).isTrue();
    }

    @Test
    public void employeeRepositoryIsAvailableFromSpringIocContainer() {
        assertThat(employeeRepository).isNotNull();
    }

    @Test
    public void shouldGetAllTheEmployees() {

        Employee kieran = new Employee("Kieran");

        Employee[] employees = new Employee[] { kieran };

        EmployeeRepository employeeRepository = new InMemoryEmployeeRepository(employees);

        List<Employee> actualEmployees = employeeRepository.getEmployees();

        assertThat(actualEmployees).containsExactly(kieran);
    }
}
