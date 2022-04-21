package data_structure;

import java.util.Stack;  
public class stack 
{  
public static void main(String[] args)   
{  
Stack<Integer> stk= new Stack<Integer>();  
stk.push(1);  
stk.push(2);  
stk.push(3);  
stk.push(4);  
System.out.println("Elements in Stack:"+stk);
System.out.println("Pop :"+stk.pop());
System.out.println("Pop :"+stk.pop());
System.out.println("Elements in Stack:"+stk);


}  
}  