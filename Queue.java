import java.util.*;
public class Queue{
	public static void main(String args[]){
	LinkedList<Integer> q = new LinkedList<Integer>();
	Scanner scan =new Scanner(System.in);
	int i=0;
	while(i==0){
	System.out.println("ADD-1 DELETE-2 DISPLAY-3 EXIT-4");
	int input = scan.nextInt();
	if(input==1){
		System.out.println("Enter the number to add");
		q.addLast(scan.nextInt());
		System.out.println("Added Successfully");
	}
	if(input==2){
		q.remove(0);
		System.out.println("Deleted Successfully");
	}
	if(input==3){
		System.out.println(""+q);
	}
	if(input==4){
		i=1;
	}
	}
}
}