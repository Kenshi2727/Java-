import java.util.*;
class ArrayReversal
{
    static int[] swap(int x[])
        {
        for(int i=0;i<x.length/2;i++)
        {
            int temp=x[i];
            x[i]=x[x.length-i-1];
            x[x.length-i-1]=temp;
        }
        return x;
        }
    public static void main(String[] args) {
       
        int a[]={1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(swap(a)));
    }
}