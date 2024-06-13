import java.util.Scanner;
class fact
{
    static int  factorial(int x)
    {
    if(x>1)
    return x*factorial(x-1);
    else
    return 1;
    }
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number whose factorial has to be calculated:");
        int n=sc.nextInt();
        System.out.println("Factorial of number is:"+factorial(n));
        sc.close();
    }
}