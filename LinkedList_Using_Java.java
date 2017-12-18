// Implementation of linked list and basic operations like follows:-
// 1) Creation of node 2)Traveral 3) Append a value 4) Prepend a value 5) Deletion with a key value.

Public Class Node{
    Node next;
    int data;
    Public Node(int data){
        this.data = data;
        }
}

//Class Linkedlist which implements different functionalities.
Public Class LinkedList{
	Node head;

	//Append at end of the linkedlist
	Public void append(int data){
	if(head == null)
	{
	    Node newnode = new Node(data);
	    head = newnode;
	    return;
	}
	Node current = head;
	while(current.next!=null)
	{
	    current = current.next;
	}
	Node newnode = new Node(data);
	current.next = newnode;
	return;
	}

	//Prepend at the start of teh linkedlist
	public void prepend(int data)
	{
	    Node newnode = new Node(data);
	    newnode.next = head;
	    head = newnode;
	    return;
 	}

	//Traversal for searching of the value.
	public void traversal(int data)
	{
	    current = head;
	    while(current.next!=null)
	    {
		if(current.data == data){
		System.out.println("Search success, Data found");
		return;
		}
		current = current.next;
	    }
	    System.out.println("Search is unsuccessful");
	    return;
	}

	// Delete the required value from the LinkedList.
	public void deletenextitem(int data)
	{
	    if(head == null)
	    return;
	    if(head.data == data)
	    {
	    head = head.next;
	    return;
	    }
            Node current = head;
	    while(current.next!=null)
	    {
	        if(current.next.data == data)
		{
		    current.next = current.next.next;
		    return;
		}
		current = current.next;
	     }
	}
}

