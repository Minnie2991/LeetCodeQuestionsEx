package com.pract;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByEamples {


	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("apple", "appricote", "banana", "kiwi");

		
		Map<Character, List<String>> grouped =
		words.stream().collect(Collectors.groupingBy( w -> w.charAt(0)));
		
	   System.out.println(grouped);
		
	}
	

}
