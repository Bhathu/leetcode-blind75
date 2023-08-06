package com.vbk.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class KidsWithGreatestNumberOfCandies {
	
	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<Boolean>();
        int maxCandies = candies[0];

        for(int i=0; i<candies.length; i++) {
            maxCandies = Math.max(maxCandies, candies[i]);
        }

        for(int i=0; i<candies.length; i++) {
            if(candies[i]+extraCandies >= maxCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
    return result;
    }

	public static void main(String[] args) {
		int[] candies = new int[] {2,3,5,1,2};
		List<Boolean> result = kidsWithCandies(candies, 3);
		
		// result.stream().forEach(System.out::print);
		System.out.println(result.stream().map(Object::toString).collect(Collectors.joining(",")).toString());
	}

}
