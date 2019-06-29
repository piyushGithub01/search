package com.trie;

class TrieIndexCalculator {
	
	public int findArrayIndex(char ch) {
		int index = -1;
//		// !-0  "-1  #-2  $-3  %-4  &-5  '-6   (-7   )-8 
//		if ((ch - '!') < 9) {
//			index = ch - '!';
//		}
		if (((ch - '0') >= 0) && ((ch - '0') < 10)) {
			index = ch - '0';
		}
		if (((ch - 'A') >= 0) && ((ch - 'A') < 26)) {
			index = ch - 'A' + 10;
		}
		if (((ch - 'a') >= 0) && ((ch - 'a') < 26)) {
			index = ch - 'a' + 10 + 26;
		}
		return index;
	}

}
