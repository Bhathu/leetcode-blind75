package com.vbk.leetcode;

public class StringCompression {
	
	public static int compress(char[] chars) {
        int i=0, count=0;
        
        while(i<chars.length) {
            int j=i+1;
            int groupCount=1;
            while(j <= chars.length-1 && chars[j] == chars[i]) {
                groupCount++;
                j++;
            }
            chars[count++] = chars[i];
            if(groupCount > 1 && groupCount < 10){
                chars[count++] = ("" + groupCount).toCharArray()[0];
            } else if(groupCount >= 10) {
                for(char ch: ("" + groupCount).toCharArray()) {
                	chars[count++] = ch;
                }
            }
            i=j;
            
        }
        return count;
    }

	public static void main(String[] args) {
		char[] arr = new char[] {'a','a','a', 'b','b','c','c','c','c','c','c','c','c','c','c','c','c'};
		int count = compress(arr);
		System.out.println(count);
		System.out.println("------------------");
		
		for(int i=0; i<count; i++) {
			System.out.println(arr[i]);
		}
	}

}
