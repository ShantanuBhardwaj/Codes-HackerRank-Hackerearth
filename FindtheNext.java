import java.util.*;
//import java.io.*;
class FindtheNext{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		//BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		//String[] ab = br.readLine().split(" ");
		int n = scan.nextInt();
		int q = scan.nextInt();
		//int[] ar3  = new int[n];
		ArrayList<Integer> arr = new ArrayList<Integer>(); 
		for(long i=0;i<n;i++)
		{
			arr.add(scan.nextInt());
		}
		while(q!=0){
			int in = scan.nextInt();
			in = in+1;
			while(arr.contains(in)){
				in = in+1;
			}
			System.out.println(in);
			q--;
		}
		}		
	}