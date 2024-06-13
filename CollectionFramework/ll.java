package graphics.CollectionFramework;

import java.util.LinkedList;

public class ll {
    public static void main(String[] args) {
        LinkedList ll1=new LinkedList();     //implements list and deque interface

        ll1.add(100);
        ll1.add(200);        
        ll1.add(300);
        System.out.println(ll1);

        LinkedList ll2=new LinkedList();

        ll2.add(100);
        ll2.add("pwpwppwwpwpwpw");        
        ll2.add(300);
        System.out.println(ll2);
        
        //It follows doubly linked list data structure
        ll2.addFirst("resolution 17"); //front end
        ll2.addLast(2000000000000000000000000000000000000000000000000000000000000000000000000000000.0);//rear end
        System.out.println(ll2);

        ll2.add(4,"$!" );       //index based insertion
        System.out.println(ll2);

        System.out.println(ll2.peek());           //returns first object withut affecting collection
        System.out.println(ll2);
        System.out.println(ll2.poll());            //returns first object and removes it
        System.out.println(ll2);
    }
    
}
