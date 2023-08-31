package com.vbk.leetcode;

public class ReverseWords {

	public static String reverseWords(String s) {
		StringBuilder result = new StringBuilder();

		if (s.length() == 0 || s.length() == 1) {
			return s;
		}
		s = s.trim();
		String[] splitWords = s.split(" ");
		result.append(splitWords[splitWords.length - 1].trim());

		for (int i = splitWords.length - 2; i >= 0; i--) {
			if (splitWords[i] != "") {
				result.append(" ");
				result.append(splitWords[i].trim());
			}
		}

		return result.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(reverseWords("a good   example"));

	}

}
