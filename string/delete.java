class delete
{
public static void main(String args[])
{
String str="Hello,have a good day";
String s="";
int i;
char ch;
for(i=0;i<str.length();i++)
{
ch=str.charAt(i);
if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
continue;
else
s=s+ch;
}
System.out.println("String without consonants:"+s);
}
}