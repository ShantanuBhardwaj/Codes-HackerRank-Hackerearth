import java.util.*;
class Frustratedcoders{
	public static void main(String args[]){
			Scanner scan = new Scanner(System.in);
			int in = scan.nextInt();
			//int[] arr = new int[in];
			List<Integer> llist  =new ArrayList<Integer>();
			for(int i=0;i<in;i++)
			{
					llist.add(scan.nextInt());
			}
			Collections.sort(llist);
			Collections.reverse(llist);
			Iterator itr = llist.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next());
			}
}
}