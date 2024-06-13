import java.util.Scanner;
class Name
{
public static void main(String []args)
{
Scanner scan=new Scanner(System.in);
int n,i,j;
System.out.println("Enter the value of n:");
n=scan.nextInt();
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)                         //code for A
{
if((i==0 && j>0 && j<n-1) || i==(n-1)/2 || (j==0 && i>0) || (j==n-1 && i>0))
System.out.print("* ");
else
System.out.print("  ");
}
System.out.print(" ");  
for(j=0;j<n;j++)                          //code for B
{
if((i==0 && j<(n-1)) || j==0 || (i==n-1 && j<(n-1)) || (i==(n-1)/2 && j<(n-1)) || (j==n-1 && i>0 && i<(n-1)))
System.out.print("* ");
else
System.out.print("  ");
}
System.out.print(" ");  
for(j=0;j<n;j++)                          //code for H
{
if(i==(n-1)/2 || j==0 || j==n-1)
System.out.print("* ");               
else
System.out.print("  ");
}
System.out.print(" "); 
for(j=0;j<n;j++)                        //code for I
{
if(i==0 || i==n-1 || j==(n-1)/2)
System.out.print("* ");
else
System.out.print("  ");
}
System.out.print(" ");   
for(j=0;j<n;j++)                        //code for S
{
if((i==0 && j>0) || (i==(n-1)/2 && j>0 && j<n-1) || (j==0 && i>0 && i<(n-1)/2) || (i==n-1 && j<(n-1)) || (j==(n-1) && i>(n-1)/2 && i<n-1) )
System.out.print("* ");
else
System.out.print("  ");
}
System.out.print(" ");
for(j=0;j<n;j++)                          //code for H
{
if(i==(n-1)/2 || j==0 || j==n-1)
System.out.print("* ");               
else
System.out.print("  ");
}
System.out.print(" "); 
for(j=0;j<n;j++)                         //code for E
{
if(i==0 || i==(n-1)/2 || j==0 || i==n-1)
System.out.print("* ");
else
System.out.print("  ");
}
System.out.print(" ");    
for(j=0;j<n;j++)                        //code for K 
{
if(j==0 || i+j==(n-1)/2 || i-j==(n-1)/2)
System.out.print("* ");
else
System.out.print("  ");
}
System.out.print("     ");
for(j=0;j<n;j++)                          //code for M
{
if(j==0)
System.out.print("*");               
else
System.out.print("");
}
System.out.print(""); 
for(j=0;j<(n-1)/2;j++)                          //code for M*
{
if(i==j && i<(n-1)/2)
System.out.print("* ");           
else
System.out.print("  ");
}
System.out.print("");
for(j=0;j<n;j++)                          //code for M**
{
if(i+j==(n-1)/2)
System.out.print("* ");
else if(j>(n-1)/2)
System.out.print("");               
else
System.out.print("  ");
}
System.out.print("");
for(j=0;j<n;j++)                          //code for M***
{
if(j==n-1)
System.out.print("* ");           
}
System.out.print(" "); 
for(j=0;j<n;j++)                         //code for A
{
if((i==0 && j>0 && j<n-1) || i==(n-1)/2 || (j==0 && i>0) || (j==n-1 && i>0))
System.out.print("* ");
else
System.out.print("  ");
}
System.out.print(" ");  
for(j=0;j<n;j++)                         //code for T
{
if(i==0 || j==(n-1)/2)
System.out.print("* ");
else
System.out.print("  ");
}
System.out.print(" "); 
for(j=0;j<n;j++)                          //code for H
{
if(i==(n-1)/2 || j==0 || j==n-1)
System.out.print("* ");               
else
System.out.print("  ");
} 
System.out.print(" "); 
for(j=0;j<n;j++)                          //code for U
{
if((j==0 && i<n-1) || (j==n-1 && i<n-1) || (i==n-1 && j>0 && j<n-1))
System.out.print("* ");               
else
System.out.print("  ");
}
System.out.print(" "); 
for(j=0;j<n;j++)                          //code for R
{
if(j==0 || (i==0 && j<n-1)|| (j==n-1 && i<(n-1)/2 && i>0) || (i==(n-1)/2 && j<n-1) || (i-j==(n-1)/2 && i>(n-1)/2))
System.out.print("* ");               
else
System.out.print("  ");
}
System.out.println(); 
}
}
}



