import java.util.*;
public class Selection_sort{
	public static void main(String args[]){
		System.out.println("Enter the Size of Array");
		Scanner scan = new Scanner(System.in);
		int in = scan.nextInt();
		int arr[] = new int[in];
		for(int i=0;i<in;i++){
				arr[i] = scan.nextInt();
		}
		//int index = -1;
		for(int i=0;i<in-1;i++){
			int max =0;
			int index=-1;
			for(int j=i;j<in;j++){
					if(arr[j]>max){
						max = arr[j];
						index = j;
					}
			}
		//	System.out.println("---------"+max+"---------"+index);
			int temp=arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
		}

		for(int i=0;i<in;i++){
				System.out.println("Answer\n"+arr[i]);
		}
		
	}
}