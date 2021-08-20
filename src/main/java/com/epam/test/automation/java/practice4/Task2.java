package com.epam.test.automation.java.practice4;

public class Task2 {

    private Task2() {}

    public static int[] transform(int[] array, SortOrder order) {
        if (null!=array && array.length>0) {
            var isSorted = Task1.isSorted(array, order);
            if (isSorted) {
                var newArray = array.clone();
                for (var i = 0; i < array.length; i++) {
                    newArray[i] = newArray[i] + i;
                }
                return newArray;
            }
            return array;
        }
        throw new IllegalArgumentException();
    }
}
