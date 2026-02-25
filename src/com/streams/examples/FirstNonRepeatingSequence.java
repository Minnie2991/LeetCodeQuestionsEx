package com.streams.examples;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FirstNonRepeatingSequence {

	
	/*Q. Find the first non-repeating sequence from a string using Java 8.
	 *  which is also first non-repeating character.
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String input = "abcdeabcdffg";
        int seqLength = 1;
        
        String result = IntStream.range(0, input.length() - 1)
        		.mapToObj(i -> input.substring(i , i + seqLength))
        		.collect(Collectors.groupingBy(Function.identity() , LinkedHashMap::new , Collectors.counting()))
        		.entrySet()
        		.stream()
        		.filter(e -> e.getValue() == 1)
        		.map(Map.Entry::getKey)
        		.findFirst()
        		.orElse("No non-repeating sequence found");
       
        System.out.println("First non-repeating sequence of length " + seqLength + ": " + result);

        

	}

}
