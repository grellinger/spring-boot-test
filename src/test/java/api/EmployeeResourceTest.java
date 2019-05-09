package api;

import domain.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import service.EmployeeService;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = EmployeeResource.class)
@WebMvcTest
public class EmployeeResourceTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EmployeeService employeeService;

    @Test
    public void thisTestPasses() {
        assertThat(true).isTrue();
    }

    @Test
    public void getsOneEmployee() throws Exception {

        // given
        String firstName = "Kieran";
        String lastName = "Murphy";

        Employee employee = Employee.builder()
                .firstName(firstName)
                .lastName(lastName)
                .build();

        when(employeeService.getEmployee(eq("123"))).thenReturn(employee);

        // when
        mockMvc.perform(get("/employees/123"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.firstName").value(firstName))
                .andExpect(jsonPath("$.lastName").value(lastName));


        // then
        verify(employeeService).getEmployee(eq("123"));

    }
}
