package com.mathur.testing.any;

import java.util.Scanner;

public class threw {
    
    public static void main(String[] args) 
    {
        System.out.println("Number deaalo be");
        try ( Scanner sc=new Scanner(System.in)) 
        {
                int num=sc.nextInt();
                threw obj=new threw();
                obj.a(num);
                obj.b(num);
        } catch (Exception e) {
            System.out.println("chutiya h kya number daal chutiyapa nahi!");
        }
    }

void a(int n)throws Exception
{
n=n*10;
System.out.println(n);
}
void b(int n1)throws Exception
{
n1=n1/10000;
System.out.println(n1);
}
}