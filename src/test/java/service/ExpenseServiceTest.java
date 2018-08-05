package service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import repo.Expense;
import repo.ExpenseRepository;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ExpenseService.class)
public class ExpenseServiceTest {

    @Autowired
    private ExpenseService expenseService;

    @MockBean
    private ExpenseRepository mockExpenseRepository;

    @Test
    public void pass() {
        assertThat(true).isTrue();
    }

    @Test
    public void expenseServiceIsInjected() {
        assertThat(this.expenseService).isNotNull();
    }

    @Test
    public void getsAllTheExpensesFromExpenseRepository() {

        Expense rent = new Expense("Rent", BigDecimal.ONE);

        when(mockExpenseRepository.getAll()).thenReturn(Arrays.asList(rent));

        List<Expense> actuals = this.expenseService.getAll();

        assertThat(actuals).containsExactly(rent);
    }
}
