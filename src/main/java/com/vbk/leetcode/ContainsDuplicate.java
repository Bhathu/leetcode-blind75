package com.vbk.leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
	
	public  static boolean containsDuplicate(int[] nums) {
	       /* Since we are sorting the array, Time complextity would be O(nlogn)
	        * 
	        * Arrays.sort(nums);

	        int i=0, j=1;
	        while(j<nums.length) {
	            if(nums[i] == nums[j]) {
	                return true;
	            }
	            j++;
	            i++;
	        }
	        return false;
	        */

	        /*
	        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

	        for(int i=0; i<nums.length; i++) {
	            if(map.containsKey(nums[i])) {
	                return true;
	            }
	            map.put(nums[i], nums[i]);
	        }

	        return false;
	        */
		
		// Using some additional space/memory, we can reduce the time complexity to O(n) using additional data structure to store the elements

	        Set<Integer> set = new HashSet<Integer>();

	        for(int i=0; i<nums.length; i++) {
	            if(set.contains(nums[i])) {
	                return true;
	            }
	            set.add(nums[i]);
	        }
	        return false;
	        

	        
	    } 
	       

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,1};
		System.out.println(containsDuplicate(arr));

	}

}
