// Ones complemet of binary string input
import java.util.*;
class Test1 
{
public static void printOnesComplement(String s)
{
    StringBuffer newstr=new StringBuffer();
    for(int i=0;i<s.length();i++){
        char c=s.charAt(i)=='1'? '0' : '1';
        newstr.append(c);
        
    }
    System.out.println(newstr);
}
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    String s= sc.next();
    printOnesComplement(s);
  }
}
