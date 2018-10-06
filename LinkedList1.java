public class LinkedList1{
	Node head;
	public static class Node{
		int data;
		Node next;
		Node(int d){
			data =d;
			next=null;
		}
	}
		public void printList(){
				Node n = head;
				while(n!=null){
						System.out.println("The Data is "+n.data);
							n=n.next;
				}
		}
	public static void main(String args[]){
		LinkedList ls  = new LinkedList();
		ls.head = new Node(1);
		Node second  = new Node(2);
		ls.head.next=second;
		Node three = new Node(3);
			second.next=three;  
		ls.printList();
	}
	}
