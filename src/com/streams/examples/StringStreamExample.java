package com.streams.examples;

import java.util.Arrays;
import java.util.List;

public class StringStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Question: ("alice", "bob", "Charlie"); get output : [5,3,7]
		
		List<String> names = Arrays.asList("alice", "bob", "Charlie");
		
		names.stream().map(word -> word.length()).toList().forEach(System.out::println);
	}

}
