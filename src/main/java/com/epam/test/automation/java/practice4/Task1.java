package com.epam.test.automation.java.practice4;

import java.util.EnumMap;
import java.util.Map;

import static com.epam.test.automation.java.practice4.SortOrder.ASC;
import static com.epam.test.automation.java.practice4.SortOrder.DESC;

public class Task1 {

    private Task1() {
    }

    private static final Map<SortOrder, OrderMap> ORDER_MAP = new EnumMap<>(SortOrder.class);

    static {
        ORDER_MAP.put(ASC, (int[] array, int i) -> array[i] > array[i + 1]);
        ORDER_MAP.put(DESC, (int[] array, int i) -> array[i] < array[i + 1]);

    }

    public static boolean isSorted(int[] array, SortOrder order) {
        if (null != array && array.length > 0) {
            for (int i = 0; i < array.length - 1; i++) {
                var data = ORDER_MAP.get(order);
                if (data.validate(array, i)) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalArgumentException();
    }

    interface OrderMap {
        boolean validate(int[] array, int i);
    }
}
