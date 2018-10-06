import java.util.*;
class ArraysLeftRotation{
			static int[] shift(int arr[]){
				int temp=arr[0];
				for(int i=0;i<arr.length-1;i++){
						arr[i] = arr[i+1];
				}
				arr[arr.length-1]  =temp;
				return arr;
			}
	public static void main(String args[]){
			Scanner scan = new Scanner(System.in);
			int len = scan.nextInt();
			int[] arr  = new int[len];
			int shift_count = scan.nextInt();
			for(int i=0;i<len;i++){
				arr[i] = scan.nextInt();
			}
			for(int i=0;i<shift_count;i++){
				arr = shift(arr);
			}
			for(int i=0;i<len;i++){
				System.out.print(arr[i]+" ");
			}
	}
}