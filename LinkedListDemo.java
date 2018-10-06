import java.util.*;
public class LinkedListDemo{
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
		public void printList(){
			Node n = head;
			while(n!=null){
				System.out.println(""+n.data);
				n = n.next;
			}
		}
		public void addFront(int value){
			if(head==null){
				head = new Node(value);
			}
			else{
			Node add_node = new Node(value);
			add_node.next = head;
			head = add_node; 
		}
		}
		public void addAnyWhere(int index, int value){
			if(head==null){
				System.out.println("not possible");
			}
			else{
				Node n = head;
				int count = 1;
				while(n!=null && count<index){
					n=n.next;
					count++;
				}
				Node a = new Node(value);
				Node b = n.next.next;
				n.next = a;
				a.next = b;
			}
} 
		public static void main(String args[]){
			LinkedListDemo lld = new LinkedListDemo();
			int flag =1; 
			Scanner scan = new Scanner(System.in);
			while(flag==1){
				System.out.println("1-to addFront,2- add anywhere(index,value),3 -to Display,4-exit");
				int i = scan.nextInt();
				if(i==1){
					System.out.println("Adding node enter the value");
					lld.addFront(scan.nextInt());
				}
				if(i==2){
					System.out.println("Enter the index,value one by one and enter");
					int ind = scan.nextInt();
					int val = scan.nextInt();
					lld.addAnyWhere(ind,val);
				}
				if(i==3){
					lld.printList();
				}
				if(i==4){
					flag=0;
				}
			}
		}
}