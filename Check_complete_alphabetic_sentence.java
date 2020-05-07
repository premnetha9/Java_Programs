/*
A program to check if a given  string is a Complete Alphabetic Sentence or Not. 
Inut - A line or one single word from the user 
Output - For the given input string check if it is a  "Complete Alphabetic Sentence" 
              if it is  "Complete Alphabetic Sentence" print true else print false

Note: The input string can contain whitespaces.
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
	}	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String line= sc.nextLine();
		checkCompleteAlphabeticSentence(line);
	}
}
