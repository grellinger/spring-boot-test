package service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;
import repository.Employee;
import repository.EmployeeRepository;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(SpringRunner.class)
public class EmployeeServiceTest {

    @TestConfiguration
    static class EmployeeServiceImplTestContextConfiguration {

        @Bean
        public EmployeeService employeeService() {
            return new EmployeeService();
        }
    }


    @Autowired
    private EmployeeService employeeService;

    @MockBean
    private EmployeeRepository employeeRepository;

    @Before
    public void setUp() {
        Mockito.when(employeeRepository.getEmployees()).thenReturn(Arrays.asList(new Employee("I WILL NOT BE MOCKED!!")));
    }

    @Test
    public void employeeServiceIsInjected() {
        assertThat(employeeService).isNotNull();
    }

    @Test
    public void employeeServiceHasMockRepository() {
        assertThat(employeeService.getAllEmployees().get(0).getName()).isEqualTo("I WILL NOT BE MOCKED!!");
    }
}
