package com.vbk.leetcode;

public class MaximumAverageSubarray {

	public static double findMaxAverage(int[] nums, int k) {
        int i=0, j=k;
        double maxAverage = -100000.00;

        if(nums.length == 1) {
            return (double) nums[i];
        }
        double sum = 0.0;
        while(j<=nums.length){
            double temp = 0.0;
            if(i==0){
                 for(int a=i; a<j; a++) {
                    sum += nums[a];
                }
                temp = sum/k;
            } else {
                sum = sum - nums[i-1];
                sum = sum + nums[j-1];
                temp = sum/k;
            }
            maxAverage = (temp > maxAverage) ? temp : maxAverage;
            i++;
            j++;
        }
        return maxAverage;
    }

	public static void main(String[] args) {
		int[] nums = new int[] {1,12,-5,-6,50,3};
		System.out.println(findMaxAverage(nums, 4));
		
	}
}
