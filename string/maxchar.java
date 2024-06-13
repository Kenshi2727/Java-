
import java.util.Scanner;
public class maxchar
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter any string:");
String str=scan.nextLine();
int i,j,frequency=0,frq=0;
char max='\0';
str=str.toUpperCase();
for(i=0;i<str.length();i++)
{
for(j=0;j<str.length();j++)
{
if(str.charAt(j)==str.charAt(i))
frequency++;
}
if(frequency>frq)
{
frq=frequency;
max=str.charAt(i);
}
frequency=0;
} 
System.out.println("Maximum occuring character is:"+max);   
}
}