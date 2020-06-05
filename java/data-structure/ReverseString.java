package com.geekwise.cors.filter;

public class Solution {
	
	public static void main(String[] args) {
		new Solution().reverseString("YogeshJ".toCharArray());
	}
	
	public void reverseString(char[] s) {
        for(int i=0;i<s.length/2;i++) {
        	char temp = s[i];
        	s[i] = s[s.length-1-i];
        	s[s.length-1-i]=temp;
        }
        System.out.println(s.toString());
    }
}
