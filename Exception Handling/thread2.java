class MyThread extends Thread{
    public void run() {
        
            System.out.println("Baccha Thread");
        }
    
}
class Thread3 extends Thread{
    public void run() {
        
            System.out.println("Baccha  3");
        }
}
public class thread2 {
    public static void main(String[] args) {
      System.out.println("Mehtwapoorna dhaga");
      MyThread t=new MyThread();
      Thread3 t1=new Thread3();
      t1.setPriority(10);       
      t.setPriority(1); 
      t.start(); 
      t1.start(); 

    }
}
