import java.io.*;
import java.util.*;
public class PlayWithNumbers{
	public static void main(String args[]) throws IOException{
	BufferedReader br  =new BufferedReader(new InputStreamReader(System.in));
	String[] input = br.readLine().split(" ");
	int array_size = Integer.parseInt(input[0]);
	int query = Integer.parseInt(input[1]);
	String arr[]  = br.readLine().split(" ");
	int a[] = new int[array_size+1];
	a[0] = 0;
	for(int i=1;i<array_size;i++){
			a[i] = a[i-1]+Integer.parseInt(arr[i]);
	} 
	while(query!=0){
		String[] lr = br.readLine().split(" ");
		int l = Integer.parseInt(lr[0]);
		int r = Integer.parseInt(lr[1]);
		int result = (a[r]-a[l-1])/(l-r+1);

		System.out.println(sum/count);
		query--;
	}
	}
}