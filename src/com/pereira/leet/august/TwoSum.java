package com.pereira.leet.august;

import java.util.HashMap;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * <pre>
 *     Input: nums = [2,7,11,15], target = 9
 *     Output: [0,1]
 *     Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 * </pre>
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> values = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (values.containsKey(target - nums[i])){
                return new int[]{values.get(target - nums[i]), i};
            } else {
                values.put(nums[i], i);
            }
        }
        return new int[]{0,0};
    }
}
