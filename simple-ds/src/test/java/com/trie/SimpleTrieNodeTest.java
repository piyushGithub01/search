package com.trie;

import org.junit.Assert;
import org.junit.Test;

public class SimpleTrieNodeTest {
	
	@Test
	public void testSimpleTrieNodeCreation() {
		SimpleTrieNode node = new SimpleTrieNode();
		Assert.assertFalse(node.isEndOfWord);
		for(SimpleTrieNode child : node.children) {
			Assert.assertNull(child);
		}
	}

}
