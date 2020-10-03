package test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CounterTest {
    @Test
    public void testIncrement(){
        Counter counter = new Counter();
        assertEquals(1,counter.increment());
        assertEquals(2,counter.increment());
    }
    @Test
    public void testDecrement(){
        Counter counter = new Counter();
        assertEquals(-1,counter.decrement());
        assertEquals(-2,counter.decrement());
    }
}
