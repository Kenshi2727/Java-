
import java.util.Scanner;
public class unique
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter any string:");
String str=scan.nextLine();
boolean flag=false;
int i,j,frequency=0;
str=str.toUpperCase();
for(i=65;i<=90;i++)
{
for(j=0;j<str.length();j++)
{
if(str.charAt(j)==i)
frequency++;
}
if(frequency>1)
{
flag=true;
break;
}
frequency=0;
}
if(flag==true)
System.out.println("String NOT UNIQUE");
else
System.out.println("String has UNIQUE characters");
}    
}
