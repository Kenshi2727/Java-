import java.util.Scanner;
public class Triangle
{
public static void main(String args[])
{
int i,j,n;    
Scanner scan=new Scanner(System.in);    
System.out.println("Enter the value of n:");
n=scan.nextInt();
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(i+j==(n-1)/2 || j-i==(n-1)/2 || i==(n-1)/2)
System.out.print("* ");
else
System.out.print("  ");    
}
System.out.println();    
}
}    
}
