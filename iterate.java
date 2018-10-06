import java.util.*;
import java.lang.*;
class iterate{
	public static void main(String args[]){
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(102);
		list.add(104);
		list.add(106);
		list.add(108);
		int sum = 0;
		Iterator iter  = list.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next()+" ");
		}
	}
}