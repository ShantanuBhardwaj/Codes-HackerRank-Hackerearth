import java.util.*;
class PairRecovery
{
	public static void main(String args[]){
		BufferReader br  = new BufferReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		int a  = Integer.parseInt(a[0]);
		int b  = Integer.parseInt(a[1]);
		int out1 = b-a;
		int out2 = a - out1;
		System.out.print(out1+" "+out2);
	}
}