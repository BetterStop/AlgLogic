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
    }
}