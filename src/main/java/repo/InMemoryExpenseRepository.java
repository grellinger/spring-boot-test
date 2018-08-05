package repo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryExpenseRepository implements ExpenseRepository {

    private List<Expense> expenses = new ArrayList<>();

    public InMemoryExpenseRepository() {

    }

    public InMemoryExpenseRepository(Expense[] expenses) {

        for(Expense expense : expenses) {
            this.expenses.add(expense);
        }
    }

    @Override
    public List<Expense> getAll() {

        List<Expense> copy = new ArrayList<>();
        copy.addAll(expenses);
        return copy;
    }
}
