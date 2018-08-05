package repo;

import java.math.BigDecimal;
import java.util.Objects;

public class Expense {

    private String expenseName;

    private BigDecimal expenseAmount;
    public Expense(String expenseName, BigDecimal expenseAmount) {
        this.expenseName = expenseName;
        this.expenseAmount = expenseAmount;
    }

    public String getExpenseName() {
        return expenseName;
    }

    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }

    public BigDecimal getExpenseAmount() {
        return expenseAmount;
    }

    public void setExpenseAmount(BigDecimal expenseAmount) {
        this.expenseAmount = expenseAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Expense expense = (Expense) o;
        return Objects.equals(expenseName, expense.expenseName) &&
                Objects.equals(expenseAmount, expense.expenseAmount);
    }

    @Override
    public int hashCode() {

        return Objects.hash(expenseName, expenseAmount);
    }


}
