package cse360assign2;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * CSE360 Assignment 2
 * JUnit test cases for AddingMachine class.
 * @author Novilia Lioe
 *
 */
public class AddingMachineTest {

    @Test
    public void test() {
        AddingMachine addMachine = new AddingMachine();
        addMachine.subtract(2);
        addMachine.add(4);
        addMachine.add(6);
        addMachine.subtract(3);
        addMachine.subtract(2);
        addMachine.add(5);
        addMachine.subtract(1);
        System.out.println("The total = " + addMachine.getTotal());
        System.out.println(addMachine.toString());
        
        addMachine.clear();
        System.out.println("Clear History..." + addMachine.toString());
        
        addMachine.add(3);
        addMachine.subtract(7);
        addMachine.add(1);
        System.out.println("\nThe total = " + addMachine.getTotal());
        System.out.println(addMachine.toString());
        
        addMachine.clear();
        System.out.println("Clear History..." + addMachine.toString());
    }

}
