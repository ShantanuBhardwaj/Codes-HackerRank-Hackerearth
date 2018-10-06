import java.util.*;
class insertion_sort{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Size of array");
		int in = scan.nextInt();
		int arr[] = new int[in];
		for(int i=0;i<in;i++){
				arr[i] = scan.nextInt();
		}
		for(int j=1;j<arr.length;j++){
			int key = arr[j];
			int i = j-1;

			while(i>=0 && arr[i]>key){
					arr[i+1]=arr[i];
					arr[i] = key;
					i--;
			}
		}
		for(int i=0;i<in;i++){
				System.out.print(arr[i]+" ");
		}
	}
}