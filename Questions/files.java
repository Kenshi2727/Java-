import java.io.*;
public class files {
    public static void main(String[] args) throws IOException
     {
        File file1=new File("Hospital.txt");
       // System.out.println(file1.exists());
        try {
             file1.createNewFile();   
        } catch (Exception e) {
        System.out.println("Something went wrong...");
        }
        System.out.println(file1.exists()); 
        // File dir=new File("Hospital management");
        // System.out.println(dir.exists());
        // dir.mkdir(); //creates directory
        // System.err.println(dir.exists());
        FileWriter fw=new FileWriter(file1,true);
        fw.write(" Ye kya ooeeeee!");
        fw.close();
    }
}
