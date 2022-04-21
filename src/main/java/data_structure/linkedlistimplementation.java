package data_structure;

public class linkedlistimplementation {
	public static void main(String[] args)
	{
	linkedlist1 list=new linkedlist1();
	list.insertAtBeginning(3);		// Add integer to the list
	list.insertAtBeginning(2);
	list.insertAtBeginning(1);
	list.display();				
	System.out.println(" ");
	list.insertAtEnd(4);		//Adding integer to the list at the end
	list.display();
	System.out.println(" ");
	list.deleteAtPos(2);		//Deleting at position
	list.display();
	}
	}
