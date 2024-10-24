package com.yashbaad.expensetracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yashbaad.expensetracker.dao.ExpenseRepository;
import com.yashbaad.expensetracker.entity.Expense;

@Service
public class ExpenseServiceImpl {

    @Autowired
    private ExpenseRepository expenseRpository;

    public List<Expense> getAllExpense() {
        return expenseRpository.findAll();
    }

    public Expense addExpense(Expense expense) {
        return expenseRpository.save(expense);
    }

}
