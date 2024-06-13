import java.util.Scanner;
class findingPower
{
    static long power(int a,int b,int c)
    {
        if(c==0)
        return 1;
        else
        {
            c--;
            return a*power(a,b,c);
        }
    }
}
public class powerRecursionDomestic
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base and power:");
        int b=sc.nextInt();
        int p=sc.nextInt();
        System.out.println("Result is "+findingPower.power(b,p,p));
        sc.close();
    }
}
