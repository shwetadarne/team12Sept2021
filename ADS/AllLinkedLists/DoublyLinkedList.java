class DoublyLinkedList
{
	 static Node head=null;
	//static Node end=null;
	 static class Node
	{
		int data;
		Node next;
		Node prev;
		Node(int d)
		{
			data=d;
			next=null;
			prev=null;
		}
	}
	 public void display()
	{
		Node n=head;
		Node p=null;
		System.out.println("display in forword direction:");
		while(n!=null)
		{
			System.out.println(n.data+" ");
			p=n;
			n=n.next;
		}
		/*System.out.println("display in backword direction:");
		while(p!=null)
		{
			System.out.println(p.data+" ");
			p=p.prev;
		}*/
	}
	
	public void insert(int new_data)
	{
		Node new_node=new Node(new_data);
		new_node.next=head;
		new_node.prev=null;
		if(head!=null)
		  head.prev=new_node;
	  head=new_node;
	}
	void append(int data)
	{
		Node new_node=new Node(data);
		Node n=head;
		new_node.next=null;
		if(head==null)
		{
		 new_node=null;  
		 //new_node=head;  //as kel tri hote work krte
		 head=new_node;
		 return;
		}
		while(n.next!=null)
		n=n.next;
	  
	   n.next=new_node;
	   	   new_node.prev=n;
	  // new_node.prev=n.next;  //pinter niss hoto last la insert nhi hot
		
	}
	/*
	void insertInBetween(Node n,int d)
	{
	  	 n=head;
		Node new_node=new Node(d);
		   if(n==null)
			{
		    n.next=new_node.prev;
		    new_node.next=null;
			}
			while(n!=null&& n.data!=data)
			{
				n=n.next;
			}
		while(n!=null&&n.data==data)
		{
		//Node new_node=new Node(88);
		new_node.next=n.next;
		n.next=new_node;
		new_node.prev=n;
		if(new_node.next!=null)
		new_node.next.prev=new_node;
		}
	}
	 */
	 void insertInBetween(Node n,int d)
	{
	  	 n=head;
		//Node new_node=new Node(88);
		   if(n==null)
			{
				System.out.println("linked list is not present");
		      return;
			}
			
		
		Node new_node=new Node(d);
		new_node.next=n.next;
		n.next=new_node;
		new_node.prev=n;
		if(new_node.next!=null)
		new_node.next.prev=new_node;
		
	}
	
	public static void main(String args[])
	{
		DoublyLinkedList d1=new DoublyLinkedList();
		
		d1.insert(11);
		d1.insert(22);
		d1.insert(33);
		d1.insert(44);
		d1.insert(55);
		d1.insert(66);
		System.out.println("after insetion at first");
		d1.display();
		System.out.println("after insetion at last");
		d1.append(77);
		d1.display();
		System.out.println("insert in between");  //vichara ych ahe
		//d1.insertInBetween(head,33);
		//d1.display();
		d1.insertInBetween(d1.head.next.next,88);
		d1.display();
	}
	
}