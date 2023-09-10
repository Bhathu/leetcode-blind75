package com.vbk.leetcode;

public class IncreasingTripletSubsequence {
	
	
	public static boolean increasingTriplet(int[] nums) {
		int left = Integer.MAX_VALUE;
		int middle = Integer.MAX_VALUE;
		
		for(int i=0;i<nums.length;i++) {
			int right = nums[i];
			
			if(right < left) {
				left = right;
			} else if(right > left && right < middle) {
				middle = right;
			} else if(right > middle && right > left) {
				return true;
			}
			
		}
        return false;
    }

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5};
		System.out.println(increasingTriplet(arr));
	}

}
