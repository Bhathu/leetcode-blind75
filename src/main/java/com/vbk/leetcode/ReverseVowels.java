package com.vbk.leetcode;

public class ReverseVowels {
	public static String reverseVowels(String s) {
		StringBuilder result = new StringBuilder(s);

        int i = 0, j = s.length()-1;

        while(i < j) {
        	while(i < j && !isVowel(s.charAt(i))) {
        		i++;
        	}
        	
        	while(j > i && !isVowel(s.charAt(j))) {
        		j--;
        	}
        	
        	if(isVowel(s.charAt(i)) && isVowel(s.charAt(j))) {
        		swap(i, j, result);
        		i++;
        		j--;
        	}
        	
        }
        return result.toString();
    }
	
	public static boolean isVowel(char ch) {
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			return true;
		}
		return false;
	}
	
	public static void swap(int i, int j, StringBuilder s) {
		char temp = s.charAt(i);
		s.setCharAt(i, s.charAt(j));
		s.setCharAt(j, temp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "HEllo";
		System.out.println(reverseVowels(s));

	}

}
