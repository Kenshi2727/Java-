interface A
{
    void method1();
}
interface B
{
    void method2();
}
class C implements A,B
{
    public void method1()
    {
        System.out.println("I am method of first interface. Implemented by C");
    }
    public void method2()
    {
        System.out.println("I am method of second interface. Implemented by C");
    }
}
public class sample
{
 public static void main(String[] args) {
 C obj=new C();
 obj.method1();
 obj.method2();
 }
}

