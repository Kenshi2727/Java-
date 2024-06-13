
import java.util.Scanner;
public class count
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in); 
String str;
System.out.println("Enter any string:");
str=scan.nextLine();
str=str.toUpperCase();
scan.close();
int i,c=0,v=0,s=0,l=str.length();
for(i=0;i<l;i++)
{
char ch=str.charAt(i);
if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
v++;
else if((ch>=32 && ch<=47) || (ch>=58 && ch<=64) || (ch>=91 && ch<=96) || (ch>=123 && ch<=126))
s++;
else if(ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U')
c++;
}
System.out.println("Number of vowels:"+v);
System.out.println("Number of consonants:"+c);
System.out.println("Number of special characters:"+s);
}
}





