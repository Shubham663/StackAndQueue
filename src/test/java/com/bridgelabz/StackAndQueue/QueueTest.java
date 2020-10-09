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
    public void pushOnQueueTest_InCorrect(){
        assertNotEquals(5 , queue.getQueue().returnFirst());
    }

    /**
     * Checks whether data is successfully removed by comparing with second element.
     */
    @Test
    public void dequeueFromQueueTest_Correct(){
    	queue.deque();
        assertEquals(40 , queue.getQueue().returnFirst());
    }
    /**
     * Ensures the data at first is not still present.
     */
    @Test
    public void dequeueFromQueueTest_InCorrect(){
    	queue.deque();
        assertNotEquals(10 , queue.getQueue().returnFirst());
    }
    /**
     * Checks for size decrement of queue
     */
    @Test
    public void sizeOfQueueAfterDequeTest_Correct(){
    	queue.deque();
        assertEquals(2 , queue.getQueue().getSize());
    }
    /**
     * Ensures size is not same as before dequeueíng
     */
    @Test
    public void sizeOfQueueAfterDequeTest_InCorrect(){
    	queue.deque();
        assertNotEquals(3 , queue.getQueue().getSize());
    }
}
