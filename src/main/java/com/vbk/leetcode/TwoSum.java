package com.vbk.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];

// Brute Force approach using 2 loops - Time complexity = O(n^2)

		/*
		 * for(int i=0; i<=nums.length-2; i++) { for(int j=i+1; j<=nums.length-1; j++) {
		 * if(nums[i]+nums[j] == target) { result[0] = i; result[1] = j; } } }
		 */

		

		// Using Map Data structure
		// Time 5ms, Memory 43.9 MB
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		boolean found = false;
		for (int i = 0; i < nums.length; i++) {
			if (!map.containsKey(nums[i])) {
				map.put(nums[i], i);
			} else if (map.containsKey(target - nums[i])) {
				result[0] = map.get(target - nums[i]);
				result[1] = i;
				found = !found;
				break;
			}
		}

		if (!found) {
			for (int j = 0; j < nums.length; j++) {
				if (target - nums[j] != nums[j] && map.containsKey(target - nums[j])) {
					result[0] = map.get(target - nums[j]);
					result[1] = j;
					break;
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {2,7,11,15};
		int target = 22;
		
		int[] result = twoSum(arr, target);
		
		System.out.print("["+result[0]+","+result[1]+"]");
		
	}

}
