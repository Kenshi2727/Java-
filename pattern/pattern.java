import java.util.Scanner;
class Pattern
{
public static void main(String []args)
{
Scanner scan=new Scanner(System.in);
int n,i,j;
System.out.println("Enter the value of n:");
n=scan.nextInt();
System.out.println("Alphabet A is:");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(i==0 || i==(n-1)/2 || j==0 || j==n-1)
System.out.print("* ");
else
System.out.print("  ");
}
System.out.println();    
}
System.out.println("Alphabet B is:");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if((i==0 && j<(n-1)) || j==0 || (i==n-1 && j<(n-1)) || (i==(n-1)/2 && j<(n-1)) || (j==n-1 && i>0 && i<(n-1)))
System.out.print("* ");
else
System.out.print("  ");
}
System.out.println();    
}
System.out.println("Alphabet C is:");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if((i==0 && j>0) || (i==n-1 && j>0) || (j==0 && i>0 && i<n-1))
System.out.print("* ");
else
System.out.print("  ");
}
System.out.println();    
}
System.out.println("Alphabet D is:");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if((i==0 && j<(n-1)) || (i==(n-1) && j<(n-1)) || j==0 || (j==n-1 && i>0 && i<(n-1)))
System.out.print("* ");
else
System.out.print("  ");
}
System.out.println();    
}
System.out.println("Alphabet E is:");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(i==0 || i==(n-1)/2 || j==0 || i==n-1)
System.out.print("* ");
else
System.out.print("  ");
}
System.out.println();    
}
System.out.println("Alphabet F is:");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(i==0 || i==(n-1)/2 || j==0)
System.out.print("* ");
else
System.out.print("  ");
}
System.out.println();    
}
System.out.println("Alphabet G is:");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if((i==0 && j>0) || (i==(n-1) && j>0 && j<=(n-1)/2) || (j==0 && i>0 && i<(n-1)) || (i==(n-1) && j<(n-1)/2 && j>0) || (j==n-1 && i>=(n-1)/2) || (i>=(n-1)/2 && j==(n+1)/2) || (i==(n-1)/2 && j>=(n-1)/2))                                                                                    
System.out.print("* ");
else
System.out.print("  ");
}
System.out.println();    
}
System.out.println("Alphabet H is:");
for(i=0;i<n;i++)
{
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