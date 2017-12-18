// Implementation of Stacks using java and performing some basic opeartion like isempty(),peek,insert and delete.

Public class Stack
{
    private static class Node
    {
	private Node next;
	private int data;
	private Node(int data)
	{
	    this.data = data;
	}
    }

//Top is the nide used to implement stack.
Public Node top;

// The below function is used to check if the stack is empty.
public boolean isEmpty()
{
    return top == null;
}

//The below function is used to return the element pointed by top.
public int peek(int data)
{
    return top.data;
}

// The below function is used to implement the push operation.
public void push(int data)
{
   Node newnode = new Node(data);
   if(top==null) 
   {
        top = newnode;
	return;
   }
   newnode.next = top;
   top = newnode;
   return;
}

//The below function is used to implement the pop opeartion.
public int pop()
{
   int data = top.data;
   top = top.next;
   return data;
}

