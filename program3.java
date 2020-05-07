/*

Program3

Write a program to check if a given  string is a Complete Alphabetic Sentence or Not. 

A "Complete Alphabetic Sentence" is a sentence containing  every letter in the English Alphabet.

if the string is "Complete Alphabetic Sentence" print true else print false

Inut - A line or one single word from the user 
Output - For the given input string check if it is a  "Complete Alphabetic Sentence" 
              if it is  "Complete Alphabetic Sentence" print true else print false

Note: The input string can contain whitespaces.


Sample Test Case -1 

input =The quick brown fox jumps over the lazy dog 
output = true 

Explanation 
The given input line Contains all the characters from ‘a’ to ‘z’ or 'A' to 'Z'
 

Sample Test Case -2 

input =ThequickBrownfoxjumpsOverThelazy doG 
output = true 

Explanation 
The given input line Contains all the characters from ‘a’ to ‘z’ or 'A' to 'Z' 

Sample Test Case - 3

input =AbcEfghuIJkzlMnOpqrsTuvWxyD
output = true

Explanation 
The given input line Contains all the characters from ‘a’ to ‘z’ or 'A' to 'Z' 




The code below reads the string from the user and 
calls a method checkCompleteAlphabeticSentence(String str);
Just implement this method


User Interface Help - Click on the Save option to save your code and 
Run option to Compile your code on the client Side
Evaluate option to submit your code to the server


*/

import java.util.*;
class Test3 
{
public static void checkCompleteAlphabeticSentence(String str)
{
    int index=0;
    boolean[] lol=new boolean[26];
	for(int i=0;i<str.length();i++){
	    if(str.charAt(i) >= 'A' && str.charAt(i)<= 'Z'){
	        index=str.charAt(i)-'A';
	        lol[index]=true;
	    }else if(str.charAt(i) >='a' && str.charAt(i) <='z'){
	        index=str.charAt(i)-'a';
	        lol[index]=true;
	    }
	}
	int k=0;
	for(int i=0;i<26;i++){
	    if(!lol[i]){
	        k=1;
	        break;
	    }
	}
	if(k==0){
	    System.out.println("true");
	}else{
	    System.out.println("false");
	}
	// write your logic here




}
public static void main(String [] args) {
Scanner sc = new Scanner(System.in);
String line= sc.nextLine();
checkCompleteAlphabeticSentence(line);
}
}
