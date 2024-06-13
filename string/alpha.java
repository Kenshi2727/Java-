
import java.util.Scanner;
public class alpha
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
String str;
System.out.println("Enter a string:");
str=scan.next();
String s="";
int i,j;
char ch;
for(i=65;i<=90;i++)
{
for(j=0;j<str.length();j++)
{
ch=str.charAt(j);
if(ch==i || ch==i+32)
s=s+ch;
}
}
System.out.println("Original String:"+str);
System.out.println("Converted String:"+s);
}
}

