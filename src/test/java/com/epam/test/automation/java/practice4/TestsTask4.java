package com.epam.test.automation.java.practice4;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestsTask4 {

    @Test
    public void ifTask4ThenSuccess() {
        //given
        var a1 = 100;
        var t = 0.5;
        var alim = 20;
        var expected = 175;
        //when
        var result = Task4.sumGeometricElements(a1, t, alim);
        //then
        assertEquals(result, expected);
    }
}
