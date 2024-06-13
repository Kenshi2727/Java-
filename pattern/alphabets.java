import java.util.Scanner;
class alphabets
{
public static void main(String []args)
{
Scanner scan=new Scanner(System.in);
int n,i,j;
System.out.println("Enter the value of n:");
n=scan.nextInt();
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if((i==0 && j>0 && j<n-1) || i==(n-1)/2 || (j==0 && i>0) || (j==n-1 && i>0))
System.out.print("* ");
else
System.out.print("  ");
}
System.out.print("  ");    
for(j=0;j<n;j++)
{
if((i==0 && j<(n-1)) || j==0 || (i==n-1 && j<(n-1)) || (i==(n-1)/2 && j<(n-1)) || (j==n-1 && i>0 && i<(n-1)))
System.out.print("* ");
else
System.out.print("  ");
}
System.out.print("  ");    
for(j=0;j<n;j++)
{
if((i==0 && j>0) || (i==n-1 && j>0) || (j==0 && i>0 && i<n-1))
System.out.print("* ");
else
System.out.print("  ");
}
System.out.print("  ");    
for(j=0;j<n;j++)
{
if((i==0 && j<(n-1)) || (i==(n-1) && j<(n-1)) || j==0 || (j==n-1 && i>0 && i<(n-1)))
System.out.print("* ");
else
System.out.print("  ");
}
System.out.print("  ");    
for(j=0;j<n;j++)
{
if(i==0 || i==(n-1)/2 || j==0 || i==n-1)
System.out.print("* ");
else
System.out.print("  ");
}
System.out.print("  ");    
for(j=0;j<n;j++)
{
if(i==0 || i==(n-1)/2 || j==0)
System.out.print("* ");
else
System.out.print("  ");
}
System.out.print("  ");    
for(j=0;j<n;j++)
{
if((i==0 && j>0) || (i==(n-1) && j>0 && j<=(n-1)/2) || (j==0 && i>0 && i<(n-1)) || (i==(n-1) && j<(n-1)/2 && j>0) || (j==n-1 && i>=(n-1)/2) || (i>=(n-1)/2 && j==(n+1)/2) || (i==(n-1)/2 && j>=(n-1)/2))
System.out.print("* ");
else
System.out.print("  ");
}
System.out.print("  ");    
for(j=0;j<n;j++)
{
if(i==(n-1)/2 || j==0 || j==n-1)
System.out.print("* ");
else
System.out.print("  ");
}
System.out.println();    
}
}
}