package com.epam.test.automation.java.practice4;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestsTask2 {

    @Test
    public void ifTask2DescThenSuccess() {
        //given
        var current = new int[]{15, 10, 3};
        var expected = new int[]{15, 11, 5};
        //when
        var result = Task2.transform(current, SortOrder.DESC);
        //then
        assertEquals(expected, result);
    }

    @Test
    public void ifTask2AscThenDoNothing() {
        //given
        var current = new int[]{1, 2, 5, 3};
        //when
        var result = Task2.transform(current, SortOrder.ASC);
        //then
        assertEquals(current, result);
    }

    @Test
    public void ifTask2AscThenSuccess() {
        //given
        var current = new int[]{1, 2, 3, 4};
        var expected = new int[]{1, 3, 5, 7};
        //when
        var result = Task2.transform(current, SortOrder.ASC);
        //then
        assertEquals(expected, result);
    }
}
