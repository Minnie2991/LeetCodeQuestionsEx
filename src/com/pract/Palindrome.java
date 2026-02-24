package com.pract;
/*
 * QUESTION: 
 * 
 * "A man, a plan, a canal: Panama"
 * here Ignore Special Characters & Case like " , 
 * */
public class Palindrome {
	
	public static boolean isPalindrome(String s) {
		
		int len = s.length();
		
		int left = 0 , right = len - 1;
		
		while(left < right) {
			
			while(left < right && !Character.isLetterOrDigit(s.charAt(left))) { 
				// since we are checking for special char " , !Character.isLetterOrDigit if its '," then left ++
				
				left ++ ;
			}
			
			while(left < right && !Character.isLetterOrDigit(s.charAt(right))) {
				right--;
			}
			
			if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
				//here the letter from left and right are compared.
				return false;
			}
			
			left ++ ;
			right --;
		}
		
		
		
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(str));
	}

}
