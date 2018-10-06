import java.util.*;
class Hash_Map{
	public static void main(String arg[]){
			HashMap<Character,Integer> map = new HashMap<>();
			char[] arr  ={'a','a','c','d','c'};
			for(int i=0;i<arr.length;i++)
			{
				if(map.containsKey(arr[i]))
				{
						int k = map.get(arr[i]);
						map.put(arr[i],k+1);
				}
				else{
					map.put(arr[i],1);
				}
			}
			int count=0;
			for(int i=0;i<arr.length;i++){
			if(map.get(arr[i]>=2))
{
			count++;
			}
}
			System.out.println(map+" count"+count);

	}
}
