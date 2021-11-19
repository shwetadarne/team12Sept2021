

import java.util.*;
import java.lang.*;

import java.text.SimpleDateFormat;
import java.util.Date;
class visitor

{
	static Node head;
	
   static class Node
  {
	  String name;
	  String address;
	  
	  Node link;
	  Node(String str,String str1)
	  {
		  name=str;
		  address=str1;
		 
		  link=null;
	  }
  }
	Scanner sc=new Scanner(System.in);
	
	visitor()
	{
	}
	
	 void entry()
	{
		System.out.println(            "====*====*====*====*====*=====*====*====*====*=====*");
		System.out.println(            "|        Welcome to Ayodhya Shelter Home           |");
		System.out.println(            "====*====*====*====*=====*=====*====*====*====*====*");
	}
	void generalDetails()
	{
		
		System.out.println("\n\nEnter your Name and Address for security purpose :");
		System.out.println(" ");
		String name=sc.next();
		
		String address=sc.next();
		insertEnd(name,address);
		
		display();
		
	}
	
	 void insertEnd(String name,String address)
   {
	  Node new_node=new Node(name,address);
	    new_node.link=null;
		Node n=head;
		if(head==null)
		{
			head=new Node(name,address);
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
    public void display()
  {
	  Node n=head;
	 
	  while(n!=null)
	  {
		
		  System.out.println("Your Details :"+"\n"+"Name    :"+n.name+"\n"+"Address :"+n.address);
		  System.out.println();
		  n=n.link;
		
	  }
  }
  
  //-------Srearching in linked list>>>>>>>
		int search(String name)
		{
			int count=0;
			Node n=head;
			while(n!=null)
			{
				if(n.name.equals(name))
					count++;
				n=n.link;
			}
			return count;
		}
	void choice()
	{
		int q;
		
	do
		{
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println("| Enter : 1 For Food Distribution ||   2 For Other Dispensiries ||   3 For Donation(Money)|");
		System.out.println("--------------------------------------------------------------------------------------------");
		int ch=sc.nextInt();
		boolean b;
		
		switch(ch)
		{
			
			default:
			System.out.println("You can spend some time with them ********\n*********because Time is one of the most powerful thing in this entire universe");
			break;
			case 1:
			    foodDistribute();
			 break;
            case 2:
			otherDispeceries();
			 break;
            case 3:
			  donation();
			break;
		}
		System.out.println(" Do you want to continue ?  press (1) / press (0) ");
		 q=sc.nextInt();
		 if(q==1)
           generalDetails();
	   else
		   return;
		   
		 
		}while(q!=0);
        	
	}
	void foodDistribute()
	{
		String food[]=new String[3];
		food[0]="Fruit & Vegetables";
		food[1]="Milk & Dairy products";
		food[2]="Beans & Pulses";
		System.out.println("What you have for children");
		 String items=sc.next();
		 System.out.println("You can come with these nutritious food also ======>");
		 System.out.println(" ");
		 System.out.println(" ----*-----*------*-----*-------*-----*------*------*------*---------*");
		 for(int i=0;i<3;i++)
		 {
			 System.out.print("[ "+food[i]+" ]   ");
		 }
		 System.out.println(" ");
		 System.out.println(" ----*-----*------*-----*-------*-----*------*------*------*----------*");
			  
			  System.out.println(" ");
				  System.out.println("You can distribute these food in between 12 pm and 2 pm");
				   System.out.println(" ");
				  System.out.println("Thank you for your Delicious and Nutritious food to our children.....! \n");
				 
			  
		
			
	}
	void otherDispeceries()
	{
		String dis[]=new String[4];
		 dis[0]="Old Clothes";
		 dis[1]="School Uniform";
		 dis[2]="Toys";
		 dis[3]="Notebooks & Pens";
		 System.out.println("What you have for children");
		 String items1=sc.next();
		 System.out.println("You can come with these items also ======>");
		 System.out.println(" ");
		 System.out.println(" ----*-----*------*-----*-------*-----*------*------*------*---------*");
		 for(int i=0;i<4;i++)
		 {
			
			 System.out.print("[ "+dis[i]+" ]   ");

		 }
		 System.out.println(" ");
		 System.out.println(" ----*-----*------*-----*-------*-----*------*------*------*----------*");
			   
			  System.out.println("You can distribute items in between 2.30 pm and 4.30 pm");
			  System.out.println(" ");
				  System.out.println("Thank you for your lovely gifts");
			  
			  
				  
		      
			  
	}
	void donation()
	{
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter your amount");
		 long amount=sc.nextLong();
		 
		 if(amount<0)
		 {
			 System.out.println("Please enter valid amount!!!!");
		 }
		  else
		 {
			 System.out.println("enter your name");
			 String name1=sc.next();
			
			  int count=search(name1);
			  if(count<2)
			  {
			 System.out.println("You donate a good amount to our orphanage home ");
			 System.out.println("|```````|");
			 System.out.println("| *   * |");
			 System.out.println("|   |   |     THANK YOU!!!!!");
			 System.out.println("|   _   |");
			 System.out.println("| _ _ _ |");
			  }
			  else
			  {
				  System.out.println("********* CONGRATUlATIONS*************");
				 System.out.println(" ");
				 System.out.println("=====>  We want you to address our children in next program!!!!!!!");
				 System.out.println(" ");
			  }
		 }
		
			 
		 
	}
	
}

class Orphanage

{
	public static void main(String rags[])
	{
		visitor v1=new visitor();
		visitor l1=new visitor();
		
		Scanner sc=new Scanner(System.in);
		
			System.out.println("  ***** VISITING TIME (10AM to 5PM)*****");
			System.out.println("Are you arrived in  between 10AM to 5PM ?  YES/NO");
			String str1=sc.next();
		     String str="yes";
			if(str.equalsIgnoreCase(str1))  
			{
				System.out.println("\t[You can enter now :)- ]");
				v1.entry();
				v1.generalDetails();
				
				v1.choice();
				System.out.println("THANK YOU  FOR VISITING:)-   !!!");
			}
		   
		
			else{
			System.out.println("  [ SORRY VISITING TIME IS OVER!!! ]  ");
			}
	}
}
	

