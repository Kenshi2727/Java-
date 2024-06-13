
import java.util.Scanner;
public class pangram
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter any string for pangram checking:");
String str=scan.nextLine();
scan.close();
String s="";
int i,j;
for(i=0;i<str.length();i++)
{
if(str.charAt(i)==' ')
continue;
else
s=s+str.charAt(i);
}
s=s.toUpperCase();
char ch[]=new char[s.length()];
for(j=0;j<s.length();j++)
ch[j]=s.charAt(j);
int arr[]=new int[26];
for(i=0;i<ch.length;i++)
{
arr[ch[i]-65]++;
}
boolean flag=false;
for(i=0;i<arr.length;i++)
{
if(arr[i]==0)
{
System.out.println("Not pangram");
flag=true;
break;
}
}
if(flag==false)
System.out.println("It's Pangram");
}
}