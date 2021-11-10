
  class LinkedList
{
	Node head;
 static class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data=d;
		next=null;
	}
}
public void display()
{
	Node n=head;
	while(n!=null)
	{
		System.out.print(n.data+"==>");
		//System.out.print(n.next+"==>");
		n=n.next;
	}
	System.out.print("NULL");
}
public static void main(String args[])
{
   LinkedList l1=new LinkedList();
   l1.head=new Node(11);
   Node second=new Node(22);
   Node third =new Node(33);
   Node forth=new Node(44);
   l1.head.next=second;
   second.next=third;
   third.next=forth;
   l1.display();
	
}
}
