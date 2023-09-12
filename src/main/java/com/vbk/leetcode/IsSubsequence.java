package com.vbk.leetcode;

public class IsSubsequence {
	
	public static boolean isSubsequence(String s, String t) {
        int i=0, j=0;

        if(s.equalsIgnoreCase(t)) return true;

        if(s.length() == 0 && t.length() >= 0) return true;

        if(s.length() >= 0 && t.length() == 0) return false;

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        while(j<t.length()) {
            if(sArray[i] == tArray[j]) {
                i++;
                j++;
            } else {
                j++;
            }

            if(i>=sArray.length) {
                return true;
            }
        }
        return false;
    }

	public static void main(String[] args) {
		System.out.println(isSubsequence("abc", "ahbgck"));

	}

}
