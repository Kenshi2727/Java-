
import java.util.Scanner;
public class duplicate
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
String str;
int i,j,count=0;
System.out.println("Enter a string:");
str=scan.nextLine();
str=str.toUpperCase(); 
scan.close();
String s[]=new String[str.length()];
for(i=0;i<str.length();i++)
s[i]=""+str.charAt(i);
for(i=0;i<str.length();i++)
{
count=0;
for(j=0;j<str.length();j++)
{
if(str.charAt(i)==str.charAt(j))
{
count++;
if(count>1)
s[j]="";
}
}
}
System.out.println("String   with  duplicates:"+str);
System.out.println("String without duplicates:");
for(i=0;i<s.length;i++)
System.out.print(s[i]);
}
}