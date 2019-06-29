package com.trie;

import org.junit.Assert;
import org.junit.Test;

public class SimpleTrieTest {
	
	@Test
	public void testInsertWord() {
		SimpleTrie trie = new SimpleTrie();
		String[] names = {"jack", "rome", "VerOnica", "0zero0", "910"};
		for(String name : names) {
			trie.insertStatement(name);
		}
	}
	
	@Test
	public void testWordExists() {
		SimpleTrie trie = new SimpleTrie();
		String[] names = {"jack", "rome", "VerOnica", "0zero0", "910"};
		for(String name : names) {
			trie.insertStatement(name);
		}
		for(String name : names) {
			Assert.assertTrue(trie.wordExists(name));
		}
		Assert.assertFalse(trie.wordExists("invalid"));
	}
	
	@Test
	public void testInsertStatement() {
		SimpleTrie trie = new SimpleTrie();
		String statement = "this IS   going 	to be 22222 Go!oD! ";
		trie.insertStatement(statement);
	}
	
	@Test
	public void testStatementExists() {
		SimpleTrie trie = new SimpleTrie();
		String statement = "this IS   going 	to be 22222 Go!oD! ";
		trie.insertStatement(statement);
		Assert.assertTrue(trie.wordExists("this"));
		Assert.assertTrue(trie.wordExists("IS"));
		Assert.assertTrue(trie.wordExists("going"));
		Assert.assertTrue(trie.wordExists("to"));
		Assert.assertTrue(trie.wordExists("be"));
		Assert.assertTrue(trie.wordExists("22222"));
		Assert.assertTrue(trie.wordExists("GooD"));
		
		Assert.assertFalse(trie.wordExists("is"));
		Assert.assertFalse(trie.wordExists("THIS"));
		Assert.assertFalse(trie.wordExists("invalid"));
	}

}
