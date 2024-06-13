public class palindrome 
{
public static void main(String args[])
{
String str="2552";
String s="";
int i,l=str.length();
for(i=0;i<l;i++)
s=str.charAt(i)+s;
if(s.equals(str))
System.out.println("Palindrome");
else
System.out.println("Not Palindrome");
}
}
