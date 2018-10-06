import java.util.*;
class random{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int[] arr = {16,5,4,19,1,100};
		int in = scan.nextInt();
		for(int i=0;i<in;i++){
			for(int j=i;j<in;j++){
				if(arr[i]>arr[j]){
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		for(int i=in;i<arr.length;i++){
			for(int j=i;j<arr.length;j++){
				if(arr[i]<arr[j]){
				int temp = arr[j];
					arr[j] = arr[i];
					arr[i] =temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}

	}
}