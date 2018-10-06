import java.util.*;
class Node{
	public static void main(String args[]){
		LinkedList<Integer> ll = new LinkedList<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of element to add");
		int number =  scan.nextInt();
		for(int i=0;i<number;i++){
			ll.addLast(scan.nextInt());
		}
		int si = 0;
		while(ll.size()>si){
			System.out.println(""+ll.get(si));
			si++;
		}
	}
}