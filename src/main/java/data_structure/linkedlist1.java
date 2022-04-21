package data_structure;

public class linkedlist1 {
	Node head;
	class Node{
	int data;
	Node next;  
	Node(int val)		// constructor for data initialization
	{
	data=val;
	next=null;
	}
	}
	linkedlist1(){
	head=null;
	}
	public void insertAtBeginning(int val)
	{
	Node newNode=new Node(val);
	
	if(head==null)		// when list is empty
		{
	head=newNode;
		}
	else		// when the list is not empty
		{
	newNode.next=head;
	head=newNode;
		}
	}
	public void display() {
	Node temp=head;
	while(temp!=null)
		{
	System.out.print(temp.data+" ");		//display the elements in the list
	temp=temp.next;
		}
	}
	public void insertAtEnd(int val)
	{
	Node newNode=new Node(val);
	if(head==null)
		{
	head=newNode;
		}
	else
	{
	Node temp = new Node(val);
	    temp = head;
	     while(temp.next != null)
	       temp = temp.next;
	     temp.next = newNode;
	}
}
	public void insertAtPos(int pos,int val) 	
	//insert the element in particular position
	{
	if(pos==0)
		{
	insertAtBeginning(val);
	return;
		}
	Node newNode=new Node(val);
	Node temp=head;
	for(int i=0;i<pos-1;i++) 
	{
	temp=temp.next;
	if(temp==null)
		{
	System.out.println("Invalid Position");
	return;
		}
	}
	newNode.next=temp.next;
	temp.next=newNode;

	}
	public void deleteAtPos(int pos)
	{
	if(head==null)
		{
	System.out.println("Empty list");
	return;
		}
	if(pos==0)
		{
	head=head.next;
	return;
		}
	Node temp=head;
	Node prev=null;
	for(int i=0;i<pos;i++)
	{
	prev=temp;
	temp=temp.next;
	}
	prev.next=temp.next;
	}
}
	

