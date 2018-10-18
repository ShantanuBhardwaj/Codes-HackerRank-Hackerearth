import java.util.*;
class NumberofMarkers{
	public static void main(String agrs[]){
		Scanner scan  = new Scanner(System.in);
		int in =  scan.nextInt();
		while(in--!=0){
			int input = scan.nextInt();
			HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
			while(input--!=0)
			{
			int lower  =scan.nextInt();
			int upper  =scan.nextInt();
			
			for(int i =lower;i<=upper;i++)
			{
				if(map.containsKey(i)){
					int k = map.get(i);
					map.put(i,k+1);
				}
				else{
					map.put(i,0);
				}
			}
		}
		for(int key:map.keySet()){
		System.out.print(key);
	}
}
}
}