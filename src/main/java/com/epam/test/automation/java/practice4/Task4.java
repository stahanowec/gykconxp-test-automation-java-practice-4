package com.epam.test.automation.java.practice4;

public class Task4 {

    private Task4() {
    }

    public static double sumGeometricElements(int a1, double t, int alim) {
        if (alim >= 0 && a1 > alim && t > 0 && t < 1) {
            double sum = 0;
            double element = a1;
            while (element>0.0000001) {
                sum = sum + element;
                element=  element * t;
                if (element < alim) {
                    break;
                }
            }
            return Math.round(sum);
        }
        throw new IllegalArgumentException();
    }
}
