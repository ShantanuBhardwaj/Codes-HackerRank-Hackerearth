import java.util.*;
public class Factorial{
	public static int plier(int n){
		if(n==1){
			return 1;
		}
		else{
			return n*plier(n-1);
		}
	}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int in = scan.nextInt();
		int out = plier(in);
		System.out.println(out);
	}
}