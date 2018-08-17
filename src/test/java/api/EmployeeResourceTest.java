package api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

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

}
