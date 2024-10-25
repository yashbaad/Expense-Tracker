package com.yashbaad.expensetracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yashbaad.expensetracker.dao.ExpenseRepository;
import com.yashbaad.expensetracker.entity.Expense;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Service
public class ExpenseServiceImpl {

    private EntityManager entityManager;

    @Autowired
    private ExpenseRepository expenseRpository;

    public List<Expense> getAllExpense() {
        return expenseRpository.findAll();
    }

    public Expense addExpense(Expense expense) {
        return expenseRpository.save(expense);
    }

    public List<Expense> findByCategory(String category) {
        return expenseRpository.findByCategory(category);
    }

}
