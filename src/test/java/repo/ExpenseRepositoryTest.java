package repo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = InMemoryExpenseRepository.class)
public class ExpenseRepositoryTest {

    @Autowired
    private ExpenseRepository expenseRepository;

    @Test
    public void pass() {
        assertThat(true).isTrue();
    }

    @Test
    public void expenseRepositoryIsInjected() {
        assertThat(expenseRepository).isNotNull();
    }

    @Test
    public void getsAllTheExpenses() {

        String expenseName = "Rent";
        BigDecimal expenseAmount = BigDecimal.ONE;

        Expense[] expenses = new Expense[] { new Expense(expenseName, expenseAmount) };
        ExpenseRepository expenseRepository = new InMemoryExpenseRepository(expenses);

        List<Expense> actuals = expenseRepository.getAll();

        assertThat(actuals).contains(expenses);
    }
}
