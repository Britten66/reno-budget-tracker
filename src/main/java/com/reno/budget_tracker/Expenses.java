package com.reno.budget_tracker;

// Author: Christopher Britten
//Renovation expense tracker
//started with spring using startSpring and added dependencies through there as well.



public class Expenses {

    // here are my variables and such


        private final String category;
    private final double amount;

    public Expenses(String category, double amount) {
        if (amount < 0) {
            throw new RuntimeException("Amount cant be less than 0");

        }
        this.category = category;
        this.amount = amount;
    }

    public String getCategory() {
        return category;

    }

    public double getAmount() {
        return amount;
    }

}

// here is a random note to explain my process with the expesnse class & naming + set up
/**
 * inteliji was giving me errors and tips to include final to these variables
 * some cool things about the path taken, OOP concepts like immutable objects can be created here
 * in this snippet, leaving out setters was on purrose as they will not need to be changed
 * if the expenses needed changing they could be added after
 */