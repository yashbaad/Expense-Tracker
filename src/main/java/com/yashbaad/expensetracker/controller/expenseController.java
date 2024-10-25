package com.yashbaad.expensetracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yashbaad.expensetracker.entity.Expense;
import com.yashbaad.expensetracker.service.ExpenseServiceImpl;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/expense")
public class expenseController {

    @Autowired
    private ExpenseServiceImpl expenseService;

    @GetMapping
    public List<Expense> getAllExpense() {
        return expenseService.getAllExpense();
    }

    @PostMapping
    public ResponseEntity<Expense> addExpense(@RequestBody Expense expense) {
        Expense savedExpense = expenseService.addExpense(expense);
        return new ResponseEntity<>(savedExpense, HttpStatus.CREATED);
    }

    @GetMapping("/by-category")
    public List<Expense> getMethodName(@RequestParam String category) {
        return expenseService.findByCategory(category);
    }

}
