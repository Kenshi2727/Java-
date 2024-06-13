
import java.util.Scanner;
class anagram
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str1,str2,s1="",s2="";
int i,j;
System.out.println("Enter strings to be checked:");
str1=sc.nextLine();
str2=sc.nextLine();
sc.close();
for(i=0;i<str1.length();i++)
{
if(str1.charAt(i)==' ')
continue;
else
s1=s1+str1.charAt(i);
}
for(i=0;i<str2.length();i++)
{
if(str2.charAt(i)==' ')
continue;
else
s2=s2+str2.charAt(i);
}
s1=s1.toUpperCase();
s2=s2.toUpperCase();

boolean flag=false;
if(s1.length()==s2.length())    //for a PERFECT ANAGRAM their lengths should be same
{
int l=s1.length();
char ch1[]=new  char[l];
char ch2[]=new  char[l];

for(i=0;i<s1.length();i++)
ch1[i]=s1.charAt(i);
for(i=0;i<s2.length();i++)
ch2[i]=s2.charAt(i);

char t;
for(i=0;i<ch1.length-1;i++)
{
for(j=0;j<ch1.length-1-i;j++)
{
if(ch1[j]<ch1[j+1])
{
t=ch1[j];
ch1[j]=ch1[j+1];
ch1[j+1]=t;
}
}
}
for(i=0;i<ch2.length-1;i++)
{
for(j=0;j<ch2.length-1-i;j++)
{
if(ch2[j]<ch2[j+1])
{
t=ch2[j];
ch2[j]=ch2[j+1];
ch2[j+1]=t;
}
}
}
for(i=0;i<l;i++)
{
if(ch1[i]==ch2[i])
continue;
else
{
flag=true;
break;
}
}
}
else
flag=true;
if(flag==false)
System.out.println("Anagram");
else
System.out.println("NOT Anagam");
}
}