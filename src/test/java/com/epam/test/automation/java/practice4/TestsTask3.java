package com.epam.test.automation.java.practice4;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public final class TestsTask3 {

    @Test
    public void ifTask3ThenSuccess() {
        //given
        var a1 = 5;
        var t = 3;
        var n = 4;
        var expected = 6160;
        //when
        var result = Task3.multiArithmeticElements(a1, t, n);
        //then
        assertEquals(result, expected);
    }
}
