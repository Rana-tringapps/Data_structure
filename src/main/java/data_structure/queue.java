package data_structure;

import java.util.*;  
public class queue
{  
public static void main(String[] args)   
{  
	Queue<Integer> q= new LinkedList<Integer>();  
q.add(1);  
q.add(2);  
q.add(3);  
q.add(4);  
System.out.println("Elements in Queue:"+q);
System.out.println("dequeue :"+q.remove());
System.out.println("dequeue :"+q.remove());
System.out.println("Elements in Queue:"+q);


}  
}  