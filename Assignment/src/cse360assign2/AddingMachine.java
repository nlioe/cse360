package cse360assign2;

/**
 * Author: Novilia Lioe
 * Class ID: 70642, CSE360 W 9:40am 
 * Assignment #: 2
 * Description: This assignment is to practice with using a version control system.
 *              Implement program that perform addition and subtraction, 
 *              then display the total.
 */

public class AddingMachine {

    private int total;
    private String history;

    /**
     * Class constructor.
     */
    public AddingMachine() {
        total = 0; // not needed - included for clarity
        history = "0";
    }

    /**
     * Get the current total.
     * 
     * @return total The current total
     */
    public int getTotal() {
        return this.total;
    }

    /**
     * Add the parameter to the total variable.
     * 
     * @param value The value to be added
     */
    public void add(int value) {
        total += value;
        history += " + " + Integer.toString(value);
    }

    /**
     * Subtract the parameter from the total variable.
     * 
     * @param value The value to be subtract
     */
    public void subtract(int value) {
        total -= value;
        history += " - " + Integer.toString(value);
    }

    /**
     * Get string representation of the object.
     * Record a history of the transactions that start from 
     * the initial 0 value to the last input.
     * 
     * @return history A history of the transactions
     */
    public String toString() {
        return history;
    }

    /**
     * Reset all of the elements to default.
     */
    public void clear() {
        this.total = 0;
        this.history = "0";
    }
}
