package ru.betterstop.AlgLogic;

import junit.framework.TestCase;
import org.junit.Test;

public class OrTest extends TestCase {

    @Test
    public void testTestRun() {
        Or or = new Or(1, 1);
        int expResult = 1;
        int result = or.getOut();
        assertEquals(expResult, result);
        or = new Or(0, 1);
        expResult = 1;
        result = or.getOut();
        assertEquals(expResult, result);
        or = new Or(1, 0);
        expResult = 1;
        result = or.getOut();
        assertEquals(expResult, result);
        or = new Or(0, 0);
        expResult = 0;
        result = or.getOut();
        assertEquals(expResult, result);
        or = new Or(new Or(1, 1), 0);
        expResult = 1;
        result = or.getOut();
        assertEquals(expResult, result);
        or = new Or(new Or(0, 0), new Or(0, 0));
        expResult = 0;
        result = or.getOut();
        assertEquals(expResult, result);




    }
}