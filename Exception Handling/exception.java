package com.mathur.testing.any;
class exception
{
public static void main(String[] args) {
    int num1=6;
    int num2=0;
    int result=0;
    int values[]={4,7,2,9};
    String name=null;
    try {
        result =num1/name.length();
    }
        catch (ArithmeticException e) {
            System.out.println("cannot divide by zero....");
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Stay in your limits....");
        }
     catch (Exception e) {
        System.out.println("Something went wrong....");
    }
    System.out.println(result);
    System.out.println("Bye");
}
}