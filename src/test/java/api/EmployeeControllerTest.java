package api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import repository.Employee;
import service.EmployeeService;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@RunWith(SpringRunner.class)
@WebMvcTest(EmployeeRestController.class)
public class EmployeeControllerTest {

    @Autowired
    MockMvc mvc;

    @MockBean
    private EmployeeService employeeService;

    @Test
    public void testsControllerWithMockService() throws Exception {

        Employee employeeReturnedFromMockEmployeeService = new Employee("I AM A MOCK SPECIFIED IN THIS TEST!");

        Mockito.when(employeeService.getAllEmployees()).thenReturn(Arrays.asList(employeeReturnedFromMockEmployeeService));

        mvc.perform(get("/api/employees"))
                .andExpect(status().isOk())
                .andExpect(content().json("[{\"name\":\"I AM A MOCK SPECIFIED IN THIS TEST!\"}]"));

    }
}
