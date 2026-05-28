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
 *setting total to 0 ahead of time when building out that method
 *an important part of clean code chp 2, using meaningful names will be added on to this starting with the for the loop
 *the for loop checks for singleExpense sum & returns the total which was set to 0 before.
 *while the loop is running it checks for each singleExpense inside expenses

 * getRemainingBudget takes budget and takes away whatever getTotalExpense value is * getSpentByCategory loops and will ONLY add an amound based on cateory needing to match & this also uses ignorecase.
 * isOverBudget returns true/false if total spent passed the budget
 *  getPercentUsed is using TotalExpenses / budget * 100 with a zero check so it never divides by zero
 */

public class BudgetTracker {

    private final double budget;

    private final List<Expenses> expenses = new ArrayList<>();

    public BudgetTracker(double budget) {
        this.budget = budget;
    }

    public void addExpense(Expenses expense) {
        expenses.add(expense);
    }

    public double getTotalExpense() {
        double total = 0;

        for (Expenses singleExpense : expenses) total += singleExpense.getAmount();
        return total;

    }


    public double getRemainingBudget() {
        return budget - getTotalExpense();
    }


    public double getSpentByCategory(String category) {

        double total = 0;
        for (Expenses singleExpense : expenses) {
            if (singleExpense.getCategory().equalsIgnoreCase(category))

                total += singleExpense.getAmount();
        }

        return total;
    }

    public boolean isOverBudget() {
        return getTotalExpense() > budget;

    }

    public double getPercentUsed() {
        if (budget == 0)
            return 0;


        return (getTotalExpense() / budget) * 100;
    }

}



