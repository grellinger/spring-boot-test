package repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EmployeeRepository.class)
public class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void employeeRepositoryIsInjected() {
        assertThat(employeeRepository).isNotNull();
    }

    @Test
    public void getsAllEmployees() {
        assertThat(employeeRepository.getEmployees().isEmpty()).isFalse();
    }
}
