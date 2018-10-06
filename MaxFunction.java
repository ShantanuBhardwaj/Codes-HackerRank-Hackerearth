import java.util.*;
class MaxFunction{
	public static void main(String args[]){
			int len  = scan.nextInt();
			int[] array = new int[len];
			for(int i=0;i<len;i++){
				array[i] = scan.nextInt();
			}
			int count =0;
			int max=-1;
			int index = 0;
			int end = 0;
			ArrayList<Integer> ar = ArrayList<Integer>();
			ArrayList<Integer> ar1 = ArrayList<Integer>();
			for(int i=0;i<len;i++){
				if(array[i]>=0){
					count = count + array[i];
					ar1.add(array[i]);
				}
				else{
					if(count>max){
						max = count;
						count =0;
					}
					else{
						ar.removeAll();
					}
				}
			}
			for(int i=0;i<ar.size;i++){
				System.out.println(ar);
			}
	}
}