package com.mathur.testing.any;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionFirst {
    public static void main(String[] args) {
    
    int num=0;
    //try with resource
    try( Scanner sc=new Scanner(System.in))       //resource will close automatically 
    {
        num=sc.nextInt();
    }

    catch (InputMismatchException e) 
    {
        System.out.println("Enter a number your input is a "+e.getMessage());
    }
 System.out.println(num);
}
}