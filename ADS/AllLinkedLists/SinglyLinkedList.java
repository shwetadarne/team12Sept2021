class SinglyLinkedList
{
	static Node head;
   static class Node
  {
	  int data;
	  Node link;
	  Node(int d)
	  {
		  data=d;
		  link=null;
	  }
  }
   public void display()
  {
	  Node n=head;
	  while(n!=null)
	  {
		  System.out.println(n.data+" ");
		  n=n.link;
	  }
  }
  /*
   void insert(int data)
   {
	   Node new_node=new Node(data);
	   new_node.link=head;
	   head=new_node;
   }
   void insertEnd(int data)
   {
	  Node new_node=new Node(data);
	    new_node.link=null;
		Node n=head;
		if(head==null)
		{
			head=new Node(data);
		}
		else
		{
		while(n.link!=null)
		{
			n=n.link;
		}
		n.link=new_node;
		}
   }
   void append(Node prev,int data)
   {
	 Node new_node=new Node(data);
	 int n=33;
	 if(head==null)
	 {
		 head=new_node;
		 new_node.link=null;
	 }
	 else
	 {
		 while(prev.data!=n)
		 {
			prev=prev.link;
		 }
        new_node.link=prev.link;
       		prev.link=new_node;
	 }
   }
   */
   
   //delete perticular value element node
public void deleteNode(int key)
{
	Node n=head;
	Node prev=null;
	if(n!=null&& n.data==key)
	{
		head=n.link;
		return;
	}
	while(n!=null&&n.data!=key)
	{
		 prev=n;
	    n=n.link;
	}
	if(n==null)
		return;
		prev.link=n.link;
}
	//delete at perticular positon 
	void DeleteNode(int pos)
	{
		if(head ==null)
		return;
	Node n=head;
	if(pos==0)
	{
		head=n.link;
	}
	for(int i=0;n!=null&&i<pos-1;i++)
		n=n.link;
	if(n==null)
		return;
	n.link=n.link.link;
	}
		//count the number of linked list
		void count()
		{
			Node n=head
			int c=0;
			while(n!=null)
			{
				c++;
				n=n.link;
			}
			return c;
		}
		//---------------------------------
		//using Recursion
		int count(Node n)
		{
			if(n==null)
				return 0;
			
			return 1+count(n.link);
		}
		//-------Srearching in linked list>>>>>>>
		boolean search(Node head,int key)
		{
			Node n=head;
			while(n!=null)
			{
				if(n.data==key)
					return true;
				n=n.link;
			}
			return false;
		}
		
		//>>>>>>reverse of linked list>>>>
		Node Reverse(Node head)
		{
			Node p=null;
			Node n=head;
			Node q=null;
			while(n!=null)
			{
				q=n.link;
				n.link=p;
				p=n;
				n=q;
			}
			q=p;
			
			
public static void main(String args[])
{
	SinglyLinkedList l1=new SinglyLinkedList();
	l1.head=new Node(11);
	Node N1=new Node(22);
	Node N2=new Node(33);
	Node N3=new Node(44);
	head.link=N1;
	N1.link=N2;
	N2.link=N3;
	/*l1.insert(55);
	l1.insertEnd(66);
	l1.append(head,77);*/
	l1.display();
	l1.deleteNode(22);
	System.out.println("after deletion");
	l1.display();
	l1.DeleteNode(2);
	System.out.println("after deletion at perticular position");
   l1.display();	
	
}
}