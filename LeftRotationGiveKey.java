import java.util.*;
class LeftRotationGiveKey{
		static int[] leftRotate(int arr[]){
			int temp = arr[0];
			//System.out.println("before shift "+arr);
			for(int i=0;i<arr.length-1;i++){
				arr[i] = arr[i+1];
			}
		arr[arr.length-1] = temp;
			return arr;
		}
		public static void main(String args[]){
			Scanner scan = new Scanner(System.in);
			int i = scan.nextInt();
			int j = scan.nextInt();
			int[] arr = new int[i];
			for(int k=0;k<i;k++){
				arr[k]= scan.nextInt();
			}
			for(int l=0;l<j;l++){
				 arr = leftRotate(arr);
	 
			}
			for(i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}