package com.vbk.leetcode;

public class CanPlaceFlower {
	
	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean result = false;

        if(n == 0) return true;

        for(int i=0; i<flowerbed.length; i++){
           if(flowerbed[i] == 0) {
               if((i>0 && flowerbed[i-1] == 0) || (i == 0)){
                   if((i<flowerbed.length-1 && flowerbed[i+1] == 0) || i == flowerbed.length-1) {
                       n--;
                       flowerbed[i]=1;
                       //System.out.println("i="+i);
                   }
               }
           } 
           if(n == 0) {
               result = true;
               break;
           }
        }
        return result;
    }

	public static void main(String[] args) {
		int[] flowerbed = new int[] {1,0,0,0,1};
		
		System.out.println(canPlaceFlowers(flowerbed, 1));

	}

}
