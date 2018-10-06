import java.util.*;
class XOR{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		long input = scan.nextLong();
		for(long in = 0;in<input;in++)
		{
			long x = scan.nextLong();
			long l = scan.nextLong();
			long r = scan.nextLong();
			long max= 0;
			long val =1;
			long i =0;
			for(i=l;i<=r;i++){
				long val1 = x^i;
				if(val1>max){
					max = val1;
				}
			}
			System.out.println(max);
		}
	}
}