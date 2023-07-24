package com.vbk.leetcode;

public class MinInRotatedSortedArray {

	public static int findMin(int[] nums) {
		if(nums.length == 1) return nums[0];
		
		int res = nums[0];
		
		for(int i=nums.length-1; i >= 1; i--) {
			if(nums[i] < nums[i-1]) {
				res = nums[i];
				break;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] arr = new int[] {2,1};
		System.out.println("Min element in sorted array : " + findMin(arr));
	}

}
