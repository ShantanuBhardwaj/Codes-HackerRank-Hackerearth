public class LinkedListTry{
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
		Node n  = head;
		while(n!=null){
			System.out.println(""+n.data);
			n = n.next;
		}
	}
	public void addNode(Node a){
		Node  n = head;
		while(n.next!=null){
			n = n.next ;
		}
		n.next = a;
	}
	public static void main(String args[]){
		LinkedListTry ls = new LinkedListTry();
		ls.head = new Node(1);
		Node first = new Node(2);
		Node second = new Node(3);
	//	ls.head.next = first;
		ls.addNode(first);
		ls.addNode(second);
	//	first.next = second;
		ls.printList();
		} 
	}