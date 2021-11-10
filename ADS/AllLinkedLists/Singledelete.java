
class Singledelete
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
	  
	   void Delete(int d)
	   {
		   //int data=d;
		   Node n=head;
		   Node prev=null;
		   if(n!=null&&n.data==d)
		   {
			   head=n.link;
			   return;
		   }
		   else
			   while(n!=null&&n.data!=d)
			   {
				   prev=n;
				   n=n.link;
			   }
				   if(n==null)
				   return;
					 prev.link=n.link;  
				   
				  
			   }
			   public void Deleteposition(int pos)
			   {
				   Node n=head;
				  if (n==null)
					  return;
				  if(pos==0)
					  head=n.link;
				  for(int i=0;i<pos-1;i++)
					  n=n.link;
				   if(n==null)
		           return;
	             n.link=n.link.link;
			   }
			   public int count()
			   {
				   int c=0;
				   Node n=head;
				   while(n!=null)
				   {
					   c++;
				   n=n.link;
				   }
				   return c;
			   }
			   public boolean Search(Node head,int key)
			   {
				   Node n=head;
				   if(n==null)
					   return false;
				   while(n!=null)
				   {
					   if(n.data==key)
						   return true;
					   
				   }
				   return false;
			   }
	public static void main(String args[])
	{
		Singledelete l1=new Singledelete();
		l1.head= new Node(11);
		Node N1=new Node(22);
		Node N2=new Node(33);
		Node N3=new Node(44);
		Node N4=new Node(55);
		Node N5=new Node(66);
		head.link=N1;
		N1.link=N2;
		N2.link=N3;
		N3.link=N4;
		N4.link=N5;
		l1.display();
		l1.Delete(22);
		System.out.println("after deletion");
		l1.display();
		//N1.link=N2;
		//head.link=N1;
		l1.Deleteposition(3);
		System.out.println("after deletion ata perticular position");
		l1.display();
		System.out.println(l1.count());
		boolean b=l1.Search(N2,33);
		System.out.println(b);
		//l1.display();
	}
}
	