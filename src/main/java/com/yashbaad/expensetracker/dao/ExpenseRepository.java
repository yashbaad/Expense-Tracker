package com.yashbaad.expensetracker.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yashbaad.expensetracker.entity.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Integer> {

}
