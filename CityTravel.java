import java.util.*;
class CityTravel{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int S = scan.nextInt();
		int X = scan.nextInt();
		int N = scan.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<N;i++){
			int val  =scan.nextInt();
			list.add(val);
			map.put(val,scan.nextInt());
		}
		Collections.sort(list);
		//System.out.println(list);
		int count=1;
		while(true){
			if(map.containsKey(count) && S>0){
				int ans = map.get(count);
				S = S - ans;
				count++;
				if(S<0){break;}
			}
			else{
			if(S>0){
				S = S-X;
				count++;
				if(S<0){break;}
			}
		}
		}
		System.out.println(count-1);
	}
}