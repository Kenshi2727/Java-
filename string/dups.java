
import java.util.Scanner;
class dups
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
String str;
int index=0;
System.out.println("Enter any string:");
str=scan.nextLine();
str=str.toUpperCase();
char ch[]=new char[str.length()];
int i,j,c=0;
for(i=65;i<=90;i++)
{
c=0;
for(j=0;j<str.length();j++)
{
if(str.charAt(j)==i || str.charAt(j)==i+32)
c++;
}
if(c>1)
{
ch[index]=(char)i;
index++;
}
}
System.out.println("Duplicate characters are:");
for(i=0;i<=index;i++)
System.out.print(ch[i]+" ");
}
}