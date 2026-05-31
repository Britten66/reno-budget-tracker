package com.reno.budget_tracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Author: Christopher Britten
// REST controller for the renovation budget tracker
// hard coding the tracker value for testing and understanding the build

@RestController
@RequestMapping("/api/budget")
public class BudgetController {

    private final BudgetTracker tracker = new BudgetTracker(13500);

    @PostMapping("/expenses")
    public String addExpense(@RequestParam String category, @RequestParam double amount) {
        tracker.addExpense(new Expenses(category, amount));
        return " Added " + category + " : $" + amount;
    }

    // GET for  total spent
    @GetMapping("/total")
    public double getTotal() {
        return tracker.getTotalExpense();
    }

    // GET amount left
    @GetMapping("/remaining")
    public double getRemaining() {
        return tracker.getRemainingBudget();
    }
    // this is for overbudget
    // another GET
    @GetMapping("/over-budget")
    public boolean isOverBudget() {
        return tracker.isOverBudget();
    }
}
