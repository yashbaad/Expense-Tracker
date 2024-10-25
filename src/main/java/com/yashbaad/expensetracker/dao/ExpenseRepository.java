package com.yashbaad.expensetracker.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.yashbaad.expensetracker.entity.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Integer> {

    @Query("SELECT e FROM Expense e WHERE e.description = :category")
    List<Expense> findByCategory(@Param("category") String category);
}
