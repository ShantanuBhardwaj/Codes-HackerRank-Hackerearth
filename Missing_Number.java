import java.util.*;
import java.io.*;
class Missing_Number{
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr=br.readLine().split(" ");
		int[] arr1 =  new int[10000];
		int sum=0;
		for(int i=0;i<arr.length;i++){
			arr1[i] = Integer.parseInt(arr[i]);
			sum = sum + arr1[i];
	//		System.out.println(arr1[i]+" "+sum);
		}
		int n=arr1[arr.length-1];
	//	System.out.println("n is "+n);
		int calculated_sum = (n*(n+1)/2);
		System.out.println(calculated_sum-sum);
	}
}