package com.Revijan;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class UniqueCharacterFind {

	public static void main(String[] args) {
		String sentence = "the quick brown fox jumps over the lazy dog";
		Set<Character> uniqueChars = new TreeSet<Character>();
		for(char ch : sentence.toCharArray()) {
			if(ch!=' ') {
				uniqueChars.add(ch);
			}
		}
		
		System.out.println(uniqueChars);
		
		
		
		Set<Character> uniqueCharacters = sentence.chars()
                                                   .filter(c->c!=' ')
                                                   .mapToObj(c->(char)c)
                                                   .collect(Collectors.toCollection(TreeSet::new));
	}

}
