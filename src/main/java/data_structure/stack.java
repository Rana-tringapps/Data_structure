package data_structure;

import java.util.Stack;  
public class stack 
{  
public static void main(String[] args)   
{  
Vector<Integer> stk= new Vector<Integer>();  
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
