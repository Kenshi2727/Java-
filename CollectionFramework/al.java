package graphics.CollectionFramework;
import java.util.*;
public class al {
    public static void main(String[] args) {
        ArrayList al1=new ArrayList();  //object created
        
        al1.add(100);
        al1.add(200);        //homogenous data(not statically typed)
        al1.add(300);
        System.out.println(al1);
        
         ArrayList al2=new ArrayList();  //object created
        
        al2.add("PW Skillsa");
        al2.add(1);        //heterogenous data(not statically typed)
        al2.add('j');
        
        al2.add(100);         //checking it's dynamic nature
        System.out.println(al2);
        
        List/*parent type */ al3=new ArrayList();/*child type */  //new collection
        
        al3.add(1);
        al3.add(2);       
        al3.add(4);
        System.out.println(al3);

        System.out.println("After adding collection");

        al3.add(al2);       //adding one collection into another

        System.out.println(al3);

        al3.add(3,"ha ha wo dekho danish ka najayas baccha"); //index based insertion
        System.out.println(al3);

        al3.add(1);        //duplicate data allowed
        System.out.println(al3);

    //checking in built methods

    System.out.println(al1.contains(100));  //returns boolean value
    System.out.println(al3.indexOf("ha ha wo dekho danish ka najayas baccha")); //returns index
    System.out.println(al3.size());  //returns size of collection

    al1.ensureCapacity(10);  //reserves space in memory
    al1.trimToSize(); //removes all unused space in memory

    al3.clear();   //clears data in collection
    System.out.println(al3);
    }
}
