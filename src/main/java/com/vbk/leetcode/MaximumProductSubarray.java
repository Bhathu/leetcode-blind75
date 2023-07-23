package com.vbk.leetcode;

public class MaximumProductSubarray {
	
	public static int maxProduct(int[] nums) {
       if(nums.length == 1) {
    	   return nums[0];
       }
		
		int max = nums[0];
        int min = nums[0];
        int res = nums[0];
        
        
        for(int i=1; i<nums.length; i++) {
        	int temp = max * nums[i];
        	max = Math.max(nums[i], Math.max(nums[i] * min, nums[i] * max));
        	min = Math.min(nums[i], Math.min(temp, nums[i] * min));
        	
        	res = Math.max(max,  res);
        }
        
        return res;
    } 

	public static void main(String[] args) {
		int[] arr = new int[] {2,3,-2,4};
		System.out.println("Max product subarray : "+ maxProduct(arr));

	}

}
