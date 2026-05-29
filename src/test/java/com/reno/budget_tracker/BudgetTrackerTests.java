package com.reno.budget_tracker;


// Author: Christopher Britten
//Renovation expense tracker


/**
 * Testing notes will be randomly jotted down here to show my thinking
 * planning to incorporate more than basic versions of unit tests to showcase my testing approach diversity
 * using beforeEach will run ahead of time, helps to not repeat myself or re enter an amount while testing
 * setUp will be void as it wont be returning anything
 *
 *adding test for
 *
 *
 *
 */
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class BudgetTrackerTests {

    private BudgetTracker tracker;

    @BeforeEach
    void setUp(){

    tracker = new BudgetTracker(13500);
}






@Test
void totalExpensesAddedUp(){
    tracker.addExpense(new Expenses("paint", 400));
    tracker.addExpense(new Expenses("flooring", 2200));

assertEquals(2600, tracker.getTotalExpense());
}



}