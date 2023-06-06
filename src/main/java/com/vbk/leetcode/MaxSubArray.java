package com.vbk.leetcode;

public class MaxSubArray {

/*
 * Maximum sub array using divide & conquer algorithm
 */
	public static int dc(int start, int end, int[] nums) {

        if(start > end) {
            return Integer.MIN_VALUE;
        }

        if(start == end) {
            return nums[start];
        }
      
            int middle = (start+end)/2;

            int left = dc(start, middle-1, nums);
            int right = dc(middle+1, end, nums);
            int middleSum = middleSum(start, end, middle, nums);

            return Math.max(Math.max(left, right), middleSum);
        
    }

    public static int middleSum(int start, int end, int middle, int[] nums) {
    	
        int left_sum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=middle; i>=start; i--) {
            sum=sum+nums[i];
            if(sum > left_sum){
                left_sum=sum;
            }
        }

        int right_sum=Integer.MIN_VALUE;
        sum=0;
        for(int i=middle; i<=end; i++) {
            sum=sum+nums[i];
            if(sum > right_sum) {
                right_sum=sum;
            }
        }
        
       // if(end < nums.length && (right_sum + nums[end]) > right_sum) right_sum += nums[end]; 

 System.out.println("Start="+start+", end="+end+", middle="+middle+", left="+left_sum+", right="+right_sum+", middleSum="+nums[middle]);

        return Math.max(left_sum + right_sum - nums[middle], Math.max(left_sum, right_sum));
    }
    
    
    
    public static void main(String[] args) {
    	int[] nums = new int[] {-2,1,-3,4,-1,2,1,-5,4};
    	System.out.println(dc(0, nums.length-1, nums));
    }
}
