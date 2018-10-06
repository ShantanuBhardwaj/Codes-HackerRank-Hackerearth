//Given a sorted and rotated array, find if there is a pair with a given sum
import java.lang.Math.*;
class Find_Pair_Sum{
	static boolean search(int arr[],int i,int key){
		for(int j =i;j<arr.length;j++){
			if(key==arr[j]){
				return true;
			}
		}
		return false;
	}
	public static void main(String args[])
	{
		int[] arr = {11,15,6,8,9,10};
		int key  = 45;
		boolean a = false;
		for(int i=0;i<arr.length;i++){
			 a  = search(arr,i,Math.abs(key-arr[i]));
			if(a==true){
				//System.out.println("true");
				break;
			}
			else{
				continue;
			}
		}
		System.out.println(a);
	}
}