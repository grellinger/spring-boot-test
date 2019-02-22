package api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
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
    MockMvc mockMvc;

    @Test
    public void pass() {
        assertThat(true).isTrue();
    }

    @Test
    public void mockMvcIsInjected() {
        assertThat(mockMvc).isNotNull();
    }

    @Test
    public void canGetAllEmployees() throws Exception {

        // when and then
        mockMvc.perform(get("/employees"))
                .andExpect(status().isOk());
    }

}
