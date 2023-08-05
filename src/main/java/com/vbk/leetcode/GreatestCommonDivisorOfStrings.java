package com.vbk.leetcode;

public class GreatestCommonDivisorOfStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreatestCommonDivisorOfStrings obj = new GreatestCommonDivisorOfStrings();
		
		System.out.println(obj.gcdOfStrings("ABCABCABC", "ABC"));

	}
	
	// Brute Force approach
	public String gcdOfStrings_BF(String str1, String str2) {
        StringBuilder result = new StringBuilder();
        String minLength = (str1.length() < str2.length()) ? str1 : str2;
        int i=minLength.length();
        
        System.out.println(str2.length() / i);

        while(i>0) {
            if((str1.length() / i > 0) && (str2.length() / i > 0)) {
                int ratio1 = str1.length() / i;
                int ratio2 = str2.length() / i;

                if(!str1.equals(appendString(ratio1, minLength))) {
                    i--;
                    minLength = minLength.substring(0, minLength.length()-1);
                    continue;
                } else if(!str2.equals(appendString(ratio2, minLength))) {
                    i--;
                    minLength = minLength.substring(0, minLength.length()-1);
                    continue;
                } else {
                    result = result.append(minLength);
                    break;
                }
            }
        }
        return result.toString();
    }

    public String appendString(int n, String str) {
        StringBuilder result = new StringBuilder();
        while(n>0) {
            result = result.append(str);
            n--;
        }
        return result.toString();
    }
    
    // 0 ms runtime
    public String gcdOfStrings(String str1, String str2) {
    if(str2.length() > str1.length()){
        return gcdOfStrings(str2,str1);
     }
     if(str1.equals(str2)){
         return str1;
     }
     if(str1.startsWith(str2)){
         return gcdOfStrings(str1.substring(str2.length()),str2);
     }

     return "";
    }

}
