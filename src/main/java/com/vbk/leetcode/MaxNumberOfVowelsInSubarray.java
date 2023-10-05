package com.vbk.leetcode;

public class MaxNumberOfVowelsInSubarray {
	
	public static int maxVowels(String s, int k) {
		int vowelsCount = 0, i=0, j=k-1, count=0;
		
		while(j<s.length()) {
			if (i == 0) {
				String temp = s.substring(i, j+1);
				for (char ch : temp.toCharArray()) {
					if (isVowel(ch)) {
						count++;
					}
				}
			} else {
				if(isVowel(s.charAt(i-1))) {
					count--;
				}
				
				if(isVowel(s.charAt(j))) {
					count++;
				}
			}
			vowelsCount = count > vowelsCount ? count : vowelsCount;
			i++;
			j++;
		} 
		
		
		
		return vowelsCount;
	}
	
	public static boolean isVowel(char ch) {
		if(ch == 'a' || ch == 'A') return true;
		if(ch == 'e' || ch == 'E') return true;
		if(ch == 'i' || ch == 'I') return true;
		if(ch == 'o' || ch == 'O') return true;
		if(ch == 'u' || ch == 'U') return true;
		return false;
	}

	public static void main(String[] args) {
		System.out.println(maxVowels("aeiou", 2));
	}
}
