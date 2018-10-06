import java.util.*;
class HiddenNumber{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		for(int i =0;i<x;i++){
			int y = scan.nextInt();
			int[] arr = new int[y];
			int sum=0;
			for(int j=0;j<y;j++){
				arr[j] = scan.nextInt();
				sum = sum + arr[j];
			}
			if(sum%y==0){
				System.out.println(sum/y);
			}
			else{
				System.out.println(-1);
			}
		}
	}
}