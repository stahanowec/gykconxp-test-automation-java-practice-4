package com.epam.test.automation.java.practice4;

public class Task3 {

    private Task3() {}

    public static int multiArithmeticElements(int a1, int t, int n) {
       if (n > 0) {
           int result = a1;
           for (int i = 0; i < n - 1; i++) {

               a1 = a1 + t;
               result *= a1;

           }
           return result;
       }
       throw new IllegalArgumentException();
    }
}
