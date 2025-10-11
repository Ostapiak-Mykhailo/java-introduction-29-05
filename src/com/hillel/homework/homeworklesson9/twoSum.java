package com.hillel.homework.homeworklesson9;

public class twoSum {
    /*Given an array of integers nums and an integer target,
    return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.*/

    public static void main(String[] args) {

        int[] nums = {4, 6, 11, 1, 7, 9, 16, 2, 3};
        int target = 16;
        getIndex(nums, target);

    }

    public static void getIndex(int[] nums, int target) {

        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    index1 = j;
                    index2 = i;
                }
            }
        }
        System.out.println("Index 1 is " + index1 + " Index 2 is " + index2);
    }
}
