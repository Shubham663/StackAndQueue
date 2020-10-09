package com.bridgelabz.StackAndQueue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class StackTest 
{
	Stack stack;
	@Before
	public void init() {
		stack = new Stack();
		stack.push(10);
		stack.push(40);
		stack.push(5);
	}
    /**
     * Tests whether top correctly points to the last added element
     */
    @Test
    public void pushOnStackTest_Correct(){
        assertEquals(stack.getTop().getData() , stack.getStack().returnFirst());
    }
    /**
     * Tests whether the element order is not reverse.
     */
    @Test
    public void pushOnStackTest_InCorrect(){
        assertNotEquals(10 , stack.getStack().returnFirst());
    }
    /**
     * Checks whether peek returns the element at top
     */
    @Test
    public void peekFromStackTest_Correct(){
        assertEquals(5 , stack.peek());
    }
    /**
     * Checks for peek not returning the bottom element
     */
    @Test
    public void peekFromStackTest_InCorrect(){
        assertNotEquals(10 , stack.peek());
    }
    /**
     * Checks whether the element returned is top element of stack
     */
    @Test
    public void popFromStackTest_Correct(){
        assertEquals(5 , stack.pop());
    }
    /**
     * Checks whether the element returned is bottom element of stack
     */
    @Test
    public void popFromStackTest_InCorrect(){
        assertNotEquals(10 , stack.pop());
    }
    /**
     * Checks that size reduces by one after pop operation
     */
    @Test
    public void popFromStackSizeTest_Correct(){
    	stack.pop();
        assertEquals(2 , stack.getStack().getSize());
    }
    /**
     * Checks that size is not same as previous after pop operation
     */
    @Test
    public void popFromStackSizeTest_InCorrect(){
    	stack.pop();
        assertNotEquals(3 , stack.getStack().getSize());
    }
}
