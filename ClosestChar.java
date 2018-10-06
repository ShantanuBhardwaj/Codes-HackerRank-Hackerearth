import java.util.*;
public class ClosestChar{
	public static List<Integer> closest(String s,List<Integer> queries){
		List<Integer> closer = new ArrayList<Integer>();
		for(int i=0;i<queries.size();i++){
			//System.out.println("Hello");
			char check = s.charAt(queries.get(i));
			int f = queries.get(i)+1;
			int b = queries.get(i)-1;
			int flag=0;
			while((f<=(s.length()-1) || b>=0) && flag==0)
			{
				if(f<=s.length()-1&&s.charAt(f)==check){
				flag=1;
				closer.add(f);
				break;
				}
				if(b>=0&&s.charAt(b)==check){
					closer.add(b);
					flag=1;
					break;
				}
				b--;
				f++;
			}
			if(flag==0){
				closer.add(-1);
			}
		}
		return closer;
	}
	public static void main(String args[]){
			Scanner scan = new Scanner(System.in);
			List<Integer> query = new ArrayList<Integer>();
			List<Integer> close = new ArrayList<Integer>();
			String in = scan.next();           //1
			int input = scan.nextInt();       //2
			for(int i=0;i<input;i++){
				query.add(scan.nextInt());   //times 3
			}
			close = closest(in,query);
			System.out.println(""+close);
	}
}