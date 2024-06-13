import java.util.Scanner;
public class gate
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
if(i==0 || i==n-1 || j==0 || j==n-1 || i+j<=(n-1)/2 || j-i>=(n-1)/2)
System.out.print("* ");
else
System.out.print("  ");    
}
System.out.println();    
}
}    
}
