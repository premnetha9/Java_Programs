/*
Program2

write a program to read a string and a value 'k' from the user 
and print it after 'k' rotations 

Here One Rotation means the first character is appended at the last of the string 

Assume the value of k will be as follows
1<=k<=Length of the String

Input - The input consists of one string followed by 'k' rotations 
Output - For the given input string , print the string after 'k' rotations 


Sample Test Case - 1
input = hello
2
output = 
llohe

Explanation - 
The string after one rotation becomes elloh
The string after second rotation becomes llohe



Sample Test Case-2

input = good
3
output = dgoo


Explanation - 
The string after first rotation becomes oodg
The string after second rotation becomes odgo
The string after third rotation becomes dgoo


The code below reads the string and 'k' rotations  from the user and 
calls a method printStringRotation(String s,int k);
Just implement this method


User Interface Help - Click on the Save option to save your code and 
Run option to Compile your code on the client Side
Evaluate option to submit your code to the server


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
	// write your logic here



}
public static void main(String [] args) {
Scanner sc = new Scanner(System.in);
String s= sc.next();
int k = sc.nextInt();
printStringRotation(s,k);
}
}
