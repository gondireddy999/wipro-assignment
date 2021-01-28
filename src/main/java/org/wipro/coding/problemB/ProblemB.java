package org.wipro.coding.problemB;
//Java Program to Implement a Phone 
//Directory Using Trie Data Structure 
import java.util.*; 


//Driver code 
public class ProblemB 
{ 
	public static void main(String args[]) 
	{ 
		Trie trie = new Trie(); 

		String contacts [] = { "Hello", "Welcome", "Hai"}; 

		trie.insertIntoTrie(contacts); 

		String query = "Hell"; 

		// Note that the user will enter 'g' then 'e' so 
		// first display all the strings with prefix as 'g' 
		// and then all the strings with prefix as 'ge' 
		trie.displayContacts(query); 
	} 
} 
