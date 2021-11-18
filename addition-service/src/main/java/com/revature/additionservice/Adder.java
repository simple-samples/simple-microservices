package com.revature.additionservice;

import java.util.List;

public class Adder {
    public static int sum(int ...nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        return sum;
    }

    public static Integer sum(List<Integer> nums) {
        Integer sum = 0;
        for (Integer i : nums) {
            sum += i;
        }
        return sum;
    }
}
