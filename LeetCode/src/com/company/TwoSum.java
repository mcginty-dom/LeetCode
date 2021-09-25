package com.company;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int x = 0; x < nums.length; x++) {
            for (int y = 0; y < nums.length; y++) {
                if (x!=y) {
                    if (nums[x]+nums[y]==target) {
                        result = new int[]{y,x};
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5};
        int target = 5;
        int[] result = new int[2];
        result = twoSum(nums,target);
        System.out.println(result[0]+"+"+result[1]+"="+target);
    }

}
