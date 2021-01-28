package org.wipro.coding.problemB;

import java.util.HashMap;

public class TrieNode 
{ 
	// Each Trie Node contains a Map 'child' 
	// where each alphabet points to a Trie 
	// Node. 
	HashMap<Character,TrieNode> child; 

	// 'isLast' is true if the node represents 
	// end of a contact 
	boolean isLast; 

	// Default Constructor 
	public TrieNode() 
	{ 
		child = new HashMap<Character,TrieNode>(); 

		// Initialize all the Trie nodes with NULL 
		for (char i = 'a'; i <= 'z'; i++) 
			child.put(i,null); 

		isLast = false; 
	} 
} 
