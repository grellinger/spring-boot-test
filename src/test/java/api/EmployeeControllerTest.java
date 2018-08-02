package api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import service.EmployeeService;

@RunWith(SpringRunner.class)
@WebMvcTest(EmployeeRestController.class)
public class EmployeeControllerTest {

    // TODO - use MockMVC tools to test the controller with a mock EmployeeService


    @Autowired
    MockMvc mockMvc;

    @MockBean
    private EmployeeService employeeService;

    @Test
    public void testsControllerWithMockService() {


    }
}
