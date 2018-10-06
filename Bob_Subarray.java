import java.util.*;
class Bob_Subarray{
		static int adder(int[] arr,int start){
			int val=1;
			//int j = start;
			for(int j=start;j<arr.length-1;j++)
			{
			for(int i=start;i<j;i++){

				val =(val | arr[i] | arr[i+1]);
				//System.out.println(i);
			}
		}
		return val;
	}

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int in = scan.nextInt();
		int[] arr = new int[in];
		for(int i=0;i<in;i++){
				arr[i] = scan.nextInt();
		}
		int sum = 0;
		for(int i=0;i<in;i++){
				sum = sum + adder(arr,i) + arr[i];;
			}
			System.out.println(sum);
		}
	}
		