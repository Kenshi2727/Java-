
import java.util.Scanner;
public class preservance
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
String str;
System.out.println("Enter a string:");
str=scan.nextLine();
scan.close();
String s="";
String sarr[]=str.split(" ");
int i;
for(String elem:sarr)
{
for(i=elem.length()-1;i>=0;i--)
{
s=s+elem.charAt(i);
}
s=s+" ";
}
System.out.println("Input:"+str);
System.out.println("Output:"+s);
}
}
