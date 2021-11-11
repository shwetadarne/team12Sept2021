
class DDL
{
	 static Node head=null;;
	class Node
	{
		int data;
		Node prev;
		   Node next;
		Node(int d)
		{
			data=d;
			 prev=null;
		    next=null;
		}
	}
	 void insert(int d)
	 {
		                              
		 Node new_node=new Node(d);
		 new_node.next=head;
		 new_node.prev=null;
		 if(head!=null)
			head.prev=new_node;
		head=new_node;
		 
	 }
	 
	 void Atposition(int pos,int d)
	 {
		 Node new_node=new Node(d);
		 Node n=head;
		 for(int i=0;i<pos-1;i++)
		 {
			 n=n.next;
		 }
		 new_node.next=n.next;
		 n.next=new_node;
		 new_node.prev=n;
		 new_node.next.prev=new_node;
	 }
	 void Append(int d)
	 {
		 Node new_node=new Node( d);
		 Node n=head;
		 new_node.next=null;
		 if(head==null)
		 {
			 new_node.prev=null;
			 new_node.next=head;
			 head=new_node;
			
			 return;
		 }
		 while(n.next!=null)
		 {
			 n=n.next;
		 }
		 n.next=new_node;
		 new_node.prev=n;
	 }
	  void DeleteFirst()
	  {
		  if(head==null)
		  System.out.println("there is no node present");
	     else{
		  head=head.next;
		  head.prev=null;
		 }
	  }
	  void DeleteLast()
	  {
		  if(head==null)
        System.out.println("there is no node present");
	    else
		{   
			Node n=head;
			Node p=n;
			while(n.next!=null)
			{
				p=n;
				n=n.next;
			}
			p.next=null;
			n.prev=null;
		}
	  }
	  void DeleteAtPosition(int pos)
	  {
		  Node n=head;
		  Node p=n;
		  for(int i=0;i<pos-1;i++)
		  {
			  p=n;
			n=n.next;
		  }
		  p.next=n.next;
		  n.next.prev=p;
		  
	  }
	   void Search(int key)
	   {
		   if(head==null)
			   System.out.println("there is no node present");
		   Node n=head;
		   while(n.next!=null&&n.data!=key)
		   {
			   n=n.next;
		   }
		   if(n.next!=null&&n.data==key)
		   System.out.println("item is found ");
	   else
		   System.out.println("item is not  found ");
	      
	   }
	  void display()
	  {
		 Node n=head;
         while(n!=null)
		 {
           System.out.print(n.data+"==>");
            n=n.next;
		 }
	  }		 
			 
	public static void main(String args[])
	{
		DDL d1=new DDL();
		
		d1.insert(55);
		System.out.println("after inserting at first");
		d1.display();
		
		d1.Append(11);
		d1.Append(22);
		d1.Append(33);
		d1.Append(44);
		d1.Append(99);
		d1.Append(100);
		System.out.println("\nAppend at last position");
		d1.display();
		System.out.println();
		System.out.println("\ninserting in between");
		d1.Atposition(1,88);
		d1.display();
		System.out.println();
		System.out.println("delete at first position");
		d1.DeleteFirst();
		d1.display();
		System.out.println();
		System.out.println("delete at last position");
		d1.DeleteLast();
		d1.display();
		System.out.println();
		System.out.println("delete at perticular position");
		d1.DeleteAtPosition(5);
		d1.display();
		System.out.println();
		d1.Search(500);
		//d1.display();
	}
}