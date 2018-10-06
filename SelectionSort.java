import java.util.*;
public class SelectionSort{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int in[] = {9,4,3,998,23,28};
		int index = 0;
		for(int i=0;i<in.length;i++){
			int min = 0;
			for(int j=i;j<in.length;j++){
					if(in[j]>min){
 						min=in[j];
 							index = j;
							}

		}
		in[index] = in[i];
		in[i] = min;
	}
	for(int k=0;k<in.length;k++){
		System.out.println(in[k]);
	}

 	}
}