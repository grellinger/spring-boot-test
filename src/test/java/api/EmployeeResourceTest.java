package api;

import static org.assertj.core.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = EmployeeResource.class)
@WebMvcTest
public class EmployeeResourceTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void thisTestPasses() {
        assertThat(true).isTrue();
    }

    @Test
    public void getEmployeesGetsOk() throws Exception {

        // given


        // when
        mockMvc.perform(get("/employees"))
                .andExpect(status().isOk());

        // then

    }
}
