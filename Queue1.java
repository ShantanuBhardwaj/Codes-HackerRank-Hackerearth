import java.util.*;
public class Queue1{
	Node head ;
	 static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
		public void add(int val){
			if(head==null){
				head = new Node(val);
				System.out.println("Head Node is successfully Created");
			}
			else{
			Node n = head;
			while(n.next!=null){
				n = n.next;	
			}
			Node new_Node  =new Node(val);
			n.next = new_Node; 
		}
		}
		public void remove(){
			if(head==null){
				System.out.println("Queue is empty");
			}
			else{
			head  = head.next;
		} 
	}
		public void display(){
			Node n = head;
			while(n!=null){
				System.out.println(""+n.data);
				n =  n.next; 
			}
		}
		public static void main(String args[])
		{
			Queue1 q = new Queue1();
			Scanner scan = new Scanner(System.in);
			int flag=1;
			while(flag==1){
			System.out.println("1-add,2-remove,3-display,4-exit");
			int input = scan.nextInt();
			if(input==1){
				System.out.println("Enter the Value to enter ");
				int v = scan.nextInt();
				q.add(v);
			}
			if(input==2){
				q.remove();
			}
			if(input==3){
				q.display();
			}
			if(input==4){
				flag=0;
			}

		}
	}
	}
