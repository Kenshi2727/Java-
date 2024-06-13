import java.util.Scanner;
class StarPatternName
{
public static void main(String []args)
{
Scanner scan=new Scanner(System.in);
int n,i,j;
System.out.println("Enter the value of n:");
n=scan.nextInt();
for(i=0;i<n;i++)                        
{
for(j=0;j<n;j++)                        //code for P
{
if((i>0 && i<(n-1)/2 && j==n-1) || j==0 || (i==0 && j<(n-1)) || (i==(n-1)/2 && j<(n-1)))
System.out.print("* ");
else
System.out.print("  ");
}
System.out.print(" ");  
for(j=0;j<n-1;j++)                                  /*code for W(we are running till 2nd last column becoz'
                                                                 we want to print W in continuation*/
{
if(i==j)
System.out.print("*");
else
System.out.print(" ");
}
System.out.print(""); 
for(j=0;j<=((n-1)/2)-1;j++)                            //code for W*
{
if(i+j==n-1 && i>=(n-1)/2)
System.out.print("*");
else
System.out.print(" ");
}  
System.out.print("");
for(j=0;j<n-1;j++)                            //code for W**
{
if(i==j && i>=(n-1)/2)
System.out.print("*");
else if(j<(n-1)/2)                         //to remove spaces forming due to rest of diagonal not under star 
System.out.print("");
else
System.out.print(" ");
}  
System.out.print("");
for(j=0;j<n;j++)                            //code  for W***
{
if(i+j==n-1)
System.out.print("*");
else
System.out.print(" ");
}
System.out.print("                             ");
for(j=0;j<n;j++)                        //code for S
{
if((i==0 && j>0) || (i==(n-1)/2 && j>0 && j<n-1) || (j==0 && i>0 && i<(n-1)/2) || (i==n-1 && j<(n-1)) || (j==(n-1) && i>(n-1)/2 && i<n-1) )
System.out.print("* ");
else
System.out.print("  ");
}
System.out.print("  ");
for(j=0;j<n;j++)                        //code for K 
{
if(j==0 || i+j==(n-1)/2 || i-j==(n-1)/2)
System.out.print("* ");
else
System.out.print("  ");
}
System.out.print("");
for(j=0;j<n;j++)                        //code for I
{
if(i==0 || i==n-1 || j==(n-1)/2)
System.out.print("* ");
else
System.out.print("  ");
}
System.out.print("  ");   
for(j=0;j<n;j++)                        //code for L
{
if(j==0 || i==n-1)
System.out.print("* ");
else
System.out.print("  ");
}
System.out.print("  ");    
for(j=0;j<n;j++)                        //code for L
{
if(j==0 || i==n-1)
System.out.print("* ");
else
System.out.print("  ");
}
System.out.print("  ");    
for(j=0;j<n;j++)                        //code for S
{
if((i==0 && j>0) || (i==(n-1)/2 && j>0 && j<n-1) || (j==0 && i>0 && i<(n-1)/2) || (i==n-1 && j<(n-1)) || (j==(n-1) && i>(n-1)/2 && i<n-1) )
System.out.print("* ");
else
System.out.print("  ");
}
System.out.println();                 //ln(next line) for control to go to next row after printing all first rows along column 
}
}
}
