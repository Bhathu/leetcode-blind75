package com.vbk.leetcode;

public class MaxConsecutiveOnes3 {
	
	public static int longestOnes(int[] nums, int k) {
        int start=0,end=0,zeroes=0;

        while(end<nums.length) {
            if(nums[end] == 0){
                zeroes++;
            }
            end++;
            if(zeroes > k) {
                if(nums[start] == 0) {
                    zeroes--;
                }
                start++;
            }
        }
        return end-start;
    }

	public static void main(String[] args) {
		int[] nums = new int[] {1,1,1,0,0,0,1,1,1,1,0};
		System.out.println(longestOnes(nums, 2));

	}

}
