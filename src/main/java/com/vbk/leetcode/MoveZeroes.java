package com.vbk.leetcode;

public class MoveZeroes {

	public static void moveZeroes(int[] nums) {
        int i=0, j=1;
		
		while(j<nums.length) {
			if(nums[i] == 0) {
				while(j<nums.length && nums[j] == 0) {
					j++;
				}
                if(j < nums.length){
                    nums[i]=nums[j];
                    nums[j] = 0;
                }
			}
			i++;
			j++;
		}
    }

	public static void main(String[] args) {
		int[] nums = new int[] {0,1,0,3,12};
		moveZeroes(nums);
		
		for(Integer i : nums) {
			System.out.println(i);
		}
	}

}
