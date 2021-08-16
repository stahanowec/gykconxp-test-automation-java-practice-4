package com.epam.test.automation.java.practice4;

import org.testng.annotations.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestsTask1 {

    @Test
    public void ifTask1ASCThenSuccess() {
        //given
        var current = new int[]{1, 2, 3, 4, 5};
        //when
        var result = Task1.isSorted(current, SortOrder.ASC);
        //then
        assertTrue(result);
    }

    @Test
    public void ifTask1ASCThenNegative() {
        //given
        var current = new int[]{1, 2, 30, 4, 5};
        //when
        var result = Task1.isSorted(current, SortOrder.ASC);
        //then
        assertFalse(result);
    }

    @Test
    public void ifTask1DESCThenSuccess() {
        //given
        var current = new int[]{5, 4, 3, 2, 1};
        //when
        var result = Task1.isSorted(current, SortOrder.DESC);
        //then
        assertTrue(result);
    }

}
