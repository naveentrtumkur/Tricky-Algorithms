//Implementation of Queue and some basic operation using queue.

Public static Class Queue{
    private static class Node{
	private Node next;
	private int data;
	private Node(int data)
	{
	    this.data = data;
	}
	}

public Node head;
public Node tail;

//This function checks whether the queue is empty and returns the appropriate value.
public boolean isempty()
{
    return head == null;
}


//This function returns the first data in queue.
public int peek()
{
    return head.data;
}

//This function inserts a value at tail of the queue
public void insertEntry(int data)
{
    Node newnode = new Node(data);
    if(tail!= null)
    {
	tail.next = newnode;
    }
    
    tail = newnode;
    //tail = newnode;
    if(head == null)
    head = newnode;
    return;
}

//This function deletes the head of the queue
public int deleteNode()
{
    if(head == null)
        return;
    int data = head.data;
    head = head.next;
    if(head == null)
	tail = null;
	return data;
}


	     
