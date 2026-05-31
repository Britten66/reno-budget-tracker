package com.reno.budget_tracker;


// Author: Christopher Britten
//Renovation expense tracker


/**
 * Testing notes will be randomly jotted down here to show my thinking
 * planning to incorporate more than basic versions of unit tests to showcase my testing approach diversity
 * using beforeEach will run ahead of time, helps to not repeat myself or re enter an amount while testing
 * setUp will be void as it wont be returning anything
 *
 *
 * here are all tests for what could fail, using assert features here mixing in T/F and throwing assertions
 *
 *adding test for adding expenses and then checking if it worked correctly
 * that will be test 1^
 *
 *test 2 will be making sure subtraction works
 *
 *test 3 will check total spent by each category
 *
 *test 4 is for matching and confirming case sensitivity behaviour
 *
 *  trying to think of test to make for something like this is weird
 *  thinking to myself, whats the easiest thing we need to be right
 *
 *  when normally the thinking is more user based
 *  test 5 will test unkownerror, the system should throw a 0 instead of breaking
 *
 *  test 7, empty and easy enough
 *
 *  test 8 .. thinking on an over/under
 * test 9 -- it was ^^
 *
 *
 *test 10 is a runtime test making sure adding negative amounts will not be accepted
 *
 *
 * all tests pass as of now, utlilizing the debugger to find some errors before pushing
 */
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class BudgetTrackerTests {

    private BudgetTracker tracker;

    @BeforeEach
    void setUp() {

        tracker = new BudgetTracker(13500);
    }


    @Test
    void totalExpensesAddedUp() {
        tracker.addExpense(new Expenses("paint", 400));
        tracker.addExpense(new Expenses("flooring", 2200));

        assertEquals(2600, tracker.getTotalExpense());


    }


    @Test
    void remainingBudgetIsCorrect() {
        tracker.addExpense(new Expenses("paint", 200));
        assertEquals(13300, tracker.getRemainingBudget());
    }

    @Test
    void spentByCategory() {

        tracker.addExpense(new Expenses("paint", 100));
         tracker.addExpense(new Expenses("paint", 50));
           assertEquals(150, tracker.getSpentByCategory("paint"));


    }


    @Test
    void caseSensitiveMatching() {
        tracker.addExpense(new Expenses("Paint", 100));
        assertEquals(100, tracker.getSpentByCategory("paint"));


    }


    @Test
    void categoryUnknownReturn(){
        tracker.addExpense(new Expenses("paint", 100));
        assertEquals(0, tracker.getSpentByCategory("flooring"));
    }


    @Test
    void emptyTracker(){
        assertEquals(0, tracker.getTotalExpense());
    }



    @Test
    void overBudget(){
    // calling the class to create a new variable that defines if the budget goes over
        BudgetTracker budgetTooHigh = new BudgetTracker(500);
        budgetTooHigh.addExpense(new Expenses("paint", 600));
        assertTrue(budgetTooHigh.isOverBudget());
    }

    @Test
    void notOverBudget(){
        // calling the class to create a new variable that defines if the budget goes over
        tracker.addExpense(new Expenses("paint", 600));
        assertFalse(tracker.isOverBudget());
    }

    @Test
    void throwIfNegative(){
        assertThrows(RuntimeException.class,
                () -> new Expenses("paint", -50));

    }
}


