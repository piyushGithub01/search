package com.trie;

class SimpleTrieNode {
	
	private static final int TRIE_SIZE = 62;
	
	SimpleTrieNode() {
		children = new SimpleTrieNode[TRIE_SIZE];
		isEndOfWord = false; 
		for (int i = 0; i < TRIE_SIZE; i++) 
            children[i] = null;
	}
	
	SimpleTrieNode[] children;
	
	boolean isEndOfWord;

}
