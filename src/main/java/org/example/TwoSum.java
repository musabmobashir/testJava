package org.example;

import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>(); // Map to store number and its index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Calculate the complement

            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i}; // Return indices of the two numbers
            } else {
                map.put(nums[i], i); // Store the number and its index in the map
            }

        }

        return new int[]{};
    }
}
