package com.bridgelabz.StackAndQueue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class QueueTest 
{
	Queue queue;
	
	@Before
	public void init() {
		queue = new Queue();
		queue.push(10);
		queue.push(40);
		queue.push(5);
	}
    /**
     * Tests whether first correctly points to the first added element
     */
    @Test
    public void pushInQueueTest_Correct(){
        assertEquals(queue.getFirst().getData() , queue.getQueue().returnFirst());
    }
    /**
     * Tests whether the element order is not reverse.
     */
    @Test
    public void pushOnStackTest_InCorrect(){
        assertNotEquals(5 , queue.getQueue().returnFirst());
    }
}
