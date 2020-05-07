/*
A program to read a string and a value 'k' from the user 
and print it after 'k' rotations 
Input - The input consists of one string followed by 'k' rotations 
Output - For the given input string , print the string after 'k' rotations 
*/
import java.util.*;
class Test2 
{
	public static void printStringRotation(String s,int k)
	{
	    for(int i=k;i<s.length();i++){
	        System.out.print(s.charAt(i));
	    }
	    for(int i=0;i<k;i++)
	    System.out.print(s.charAt(i));
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String s= sc.next();
		int k = sc.nextInt();
		printStringRotation(s,k);
	}
}
