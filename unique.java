import java.util.*;
class unique{
	public static void main(String args[]){
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		int[] a = {1,9,10,2,4,5,1,9};
		for(int i=0;i<a.length;i++){
			if(map.containsKey(a[i])){
				int k = map.get(a[i]);
				map.put(a[i],k+1);
			}
			else{
				map.put(a[i],1);
			}
		}
		Set<Integer> keys = map.keySet();
		for(Integer key:keys){
			System.out.println(key);
		}
	}
}