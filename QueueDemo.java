import java.util.*;
public class QueueDemo{
	public static void main(String args[]){
		LinkedList<Integer> queue  = new LinkedList<Integer>();
		Scanner scan = new Scanner(System.in);
		int i=1;
		while(i==1){
			System.out.println("ADD-1\tDELETE-2\tDISPLAY-3\tEXIT-4");
		int input  = scan.nextInt();
			if(input==1){
					System.out.println("Enter the element to add");
					queue.add(scan.nextInt());	
			}
			if(input==2){
				System.out.println("Enter the index to remove");
				int index = scan.nextInt();
				queue.remove(index);
				}
			if(input==3){
				System.out.println("Elements Are "+queue);
			}
			if(input==4){
				i=0;
			}
	}
}
}