import java.util.*;
class gcd{
	static int gcd_finder(int a,int b){
		if(a==0){
			return b;
		}
		else{
			return gcd_finder(b%a,a);
		}
	}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(gcd_finder(a,b));
	}
}