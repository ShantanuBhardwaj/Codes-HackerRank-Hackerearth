import java.util.*;
class Pattern{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int in = scan.nextInt();
		int[] arr = new int[in];
		arr[0] =1;
		arr[1] =1;
		for(int i=2;i<in;i++){
			arr[i] =arr[i-1]+arr[i-2]; 
		}
		for(int i=0;i<in;i++){
			System.out.print(arr[i]); 
		}
		System.out.println();
		int n =  in-1;
		int gap= arr[n] + arr[n-1];
		int diff = 0;
		while(gap>0){
			int val = arr[n];
			for(int i=0;i<val;i++){
				for(int k=0;k<diff;k++){
					System.out.print(" ");
				}
				System.out.print("*");
				for(int j =0;j<gap;j++){
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println();
				
			}
				gap = gap-2;
				n--;
				diff++;
		}
		/* for(int i=-1;i<diff;i++){
			System.out.print(" ");
		}
		System.out.print("*");
		System.out.println();
		*/
		gap = 0;
		n =0;
		int p = arr[in-1] + arr[in-2];
		while(gap<=p){
			int val = arr[n];
			for(int i=0;i<val;i++)
			{
				for(int k=0;k<diff;k++)
				{
					System.out.print(" ");
				}
				System.out.print("*");
				for(int j =0;j<gap;j++)
				{
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println();
				
			}
				gap = gap+2;
				n++;
				diff--;
		}
	}
}