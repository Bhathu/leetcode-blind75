package com.vbk.leetcode;

public class ProductOfArrayExceptSelf {
	
    public static int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        //prefix[0] = nums[0];
        prefix[0]=0;
        prefix[1]=nums[0];
        for(int i=2; i<nums.length; i++) {
           prefix[i] = nums[i-1] * prefix[i-1];
         }

        int[] suffix = new int[nums.length];
        suffix[0] = 0;
        suffix[1] = nums[nums.length-1];
        int k = 2;
        for(int i=nums.length-2; i>0; i--){
            suffix[k] = suffix[k-1] * nums[i];
            k++;
        }
      
      /*  System.out.println("Prefix");
        for(int i=0; i<prefix.length; i++){
            System.out.println(prefix[i]);
        }

         System.out.println("Suffix");
        for(int i=0; i<suffix.length; i++){
            System.out.println(suffix[i]);
        }
        */

        int[] result = new int[nums.length];
        result[0] = suffix[prefix.length-1];
        result[nums.length-1] = prefix[prefix.length-1];
        for(int i=1; i<nums.length-1; i++){
            result[i] = prefix[i] * suffix[suffix.length-1-i];
        }


    return result;
    }

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4};
		
		int[] result=productExceptSelf(arr);
		
		System.out.print("[");
		for(int i=0; i<result.length-1; i++) {
			System.out.print(result[i]+",");
		}
		System.out.print(result[result.length-1]+"]");
	}

}
