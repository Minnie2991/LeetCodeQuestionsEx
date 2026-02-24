package com.streams.examples;

import java.util.List;
import java.util.stream.Collectors;

public class SwapVowels {
	
	private static boolean isVowel(char c) {
	    return "aeiouAEIOU".indexOf(c) != -1;
	}
	
	public static String swapWords(String s) {
		
		char[] ch = s.toCharArray();
		
		int start = 0 , end = ch.length -1;
		
		while(start < end) {
			
			while(start < end &&  ! isVowel(ch[start])) {
				start ++;
			}
			while(start < end &&  ! isVowel(ch[end])) {
				end --;
			}
			
			char temp = ch[end];
			ch[end] = ch[start];
			ch[start] = temp;
			
			start ++;
			end --;
			
		}
		return new String(ch);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "IceCreAm";
		
		System.out.println(swapWords(str));
		

	}

}
