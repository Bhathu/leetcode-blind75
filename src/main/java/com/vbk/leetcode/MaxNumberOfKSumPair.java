package com.vbk.leetcode;

import java.util.Arrays;

public class MaxNumberOfKSumPair {
	
	public static int maxOperations(int[] nums, int k) {
		int i=0, j=nums.length-1, count=0;
		Arrays.sort(nums);

		while(i<j) {

		  if(nums[i] + nums[j] > k) {
			j--;
		  } else if(nums[i] + nums[j] < k) {
			i++;
		  } else {
			count++;
			i++;
			j--;
		  }
		}
	  
	   return count;
   }

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4};

		System.out.println(maxOperations(arr, 5));
	}

}
