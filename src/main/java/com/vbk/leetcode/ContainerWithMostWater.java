package com.vbk.leetcode;

public class ContainerWithMostWater {
	
	public static int maxArea(int[] height) {
        int i=0, j=height.length-1, max=Integer.MIN_VALUE;

        while(i<height.length) {
            int min = Math.min(height[i], height[j]);
            int currentCapacity = min * (j-i);
            max = (currentCapacity > max) ? currentCapacity : max;
            
            if(height[i] > height[j]) {
                j--;
            } else {
                i++;
            }
        }
        return max;
    }

	public static void main(String[] args) {
		int[] arr = new int[] {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(arr));
	}

}
