import java.io.*;
class PairRecovery
{
	public static void main(String args[])throws Exception
	{
		//BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		int a  = Integer.parseInt(arr[0]);
		int b  = Integer.parseInt(arr[1]);
		int out1 = b-a;
		int out2 = a-out1;
		System.out.print(out2+" "+out1);
	}
}