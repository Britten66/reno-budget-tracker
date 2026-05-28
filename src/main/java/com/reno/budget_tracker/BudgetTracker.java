package com.reno.budget_tracker;


// Author: Christopher Britten
//Renovation expense tracker

import java.util.ArrayList;
import java.util.List;


/**
 * building out some methods
 * this class will contain 7 methods for budget tracking
 * ------
 * this will contain more random notes and thinking along the way
 *
 *
 */

public class BudgetTracker {

    private final double budget;

    private final list<Expenses> expenses = new ArrayList<>();

    public BudgetTracker(double budget) {
        this.budget = budget;
    }

    public void addExpense(Expenses expense) {
        expenses.add(expense);
    }

}
