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
logger.log("Elements in Stack:"+stk);
logger.log("Pop :"+stk.pop());
logger.log("Pop :"+stk.pop());
logger.log("Elements in Stack:"+stk);


}  
}  
