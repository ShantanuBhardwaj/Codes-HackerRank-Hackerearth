import java.io.*;
class ArrayManipulation
{
	public static void main(String args[])throws Exception
	{
		//Scanner scan = new Scanner(System.in);
		long max =0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] ar= br.readLine().split(" ");
		long arr_size = Long.parseLong(ar[0]);
		Long loop = Long.parseLong(ar[1]);
		long[] arr = new long[(int)arr_size+1];
		for(long k=1;k<=arr_size;k++)
		{
			arr[(int)k]=0;
		}
		for(long i=0;i<loop;i++)
		{ 
		
			String[] input = br.readLine().split(" ");
			long a = Long.parseLong(input[0]);
			long b = Long.parseLong(input[1]);
			long k = Long.parseLong(input[2]);
			for(long j=a;j<=b;j++)
			{
				arr[(int)j] = arr[(int)j] + k;
				if(arr[(int)j]>max)
				{
					max = arr[(int)j];
				}
			}
		}
		System.out.println(max);
	}
}