import java.util.*;
public class CountDivisors{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String in = scan.next();
		String[] a  =in.split(",");
		int l = Integer.parseInt(a[0]);
		int r = Integer.parseInt(a[1]);
		int  k = Integer.parseInt(a[2]);
		int count=0;
		for(int i=l;i<=r;i++){
			if(i%k==0){
				count++;
			}
		}
		System.out.println(count);
	}
}