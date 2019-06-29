package com.trie;

import org.junit.Assert;
import org.junit.Test;


public class TrieIndexCalculatorTest {
	
	@Test
	public void testFindTrieIndex() {
		TrieIndexCalculator calc = new TrieIndexCalculator();
		Assert.assertEquals(0, calc.findArrayIndex('0'));
		Assert.assertEquals(9, calc.findArrayIndex('9'));
		Assert.assertEquals(10, calc.findArrayIndex('A'));
		Assert.assertEquals(35, calc.findArrayIndex('Z'));
		Assert.assertEquals(36, calc.findArrayIndex('a'));
		Assert.assertEquals(61, calc.findArrayIndex('z'));
	}

}
