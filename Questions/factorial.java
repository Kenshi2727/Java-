import java.util.Scanner;
public class factorial
 {
    public static int factorialNum(int n)
    {
        int result;
        if(n==0 || n==1)
        return 1;
        else
        result=n*factorialNum(n-1);  //last mein 1 iss sub function mein return hoga 
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to find its factorial:");
        int num=sc.nextInt();
        System.out.println("Factorial of the number is "+factorialNum(num));
        sc.close();
    }
}
