package com.trie;

import java.util.ArrayList;
import java.util.List;

class SimpleTrie {
	
	final private SimpleTrieNode root;
	final private TrieIndexCalculator indexcalculator = new TrieIndexCalculator();
	
	SimpleTrie() {
		root = new SimpleTrieNode();
	}
	
	/*
	 * breaks statement to words and inserts words into trie data structure
	 */
	public void insertStatement(String statement) {
		if(statement == null)
			return;
		statement = filterChar(statement);
		String[] words = statement.trim().split("\\s+");
		for(String word : words) {
			insert(word);
		}
	}
	
	private void insert(String word) {
		SimpleTrieNode node = root;
		int index;
		for(int i=0; i<word.length(); i++) {
			index = indexcalculator.findArrayIndex(word.charAt(i));
			if(node.children[index] == null) {
				node.children[index] = new SimpleTrieNode();
			}
			node = node.children[index];
		}
		node.isEndOfWord = true;
	}

	private String filterChar(String line) {
		return line.replaceAll("[^a-zA-Z0-9\\s+]", "");
	}
	
	/*
	 * verify if word exists in trie data structure
	 */
	public boolean wordExists(String word) {
		SimpleTrieNode node = root;
		int index;
		for(int i=0; i<word.length(); i++) {
			index = indexcalculator.findArrayIndex(word.charAt(i));
			if(node.children[index] == null) {
				return false;
			}
			node = node.children[index];
		}
		return (node != null && node.isEndOfWord);
	}
	
	public List<String> suggestions(String input) {
		List<String> result = new ArrayList<String>();
		if(input == null || input.trim().length() < 3)
			return result;
		input = filterChar(input);
		SimpleTrieNode node = root;
		int index;
		for(int i=0; i<input.length(); i++) {
			index = indexcalculator.findArrayIndex(input.charAt(i));
			if(node.children[index] == null) {
				return result;
			}
			node = node.children[index];
		}
		return result;
	}

}
