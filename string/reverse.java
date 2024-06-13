
import java.util.Scanner;
public class reverse
{
public static void main(String args[])
{
try (Scanner scan = new Scanner(System.in)) {
    String str;
    System.out.println("Enter a string:");
    str=scan.next();
    String s="";
    int i,l=str.length();
    for(i=0;i<l;i++)
    s=str.charAt(i)+s;
    System.out.println("Input:"+str);
    System.out.println("Output:"+s);
}
}
}
