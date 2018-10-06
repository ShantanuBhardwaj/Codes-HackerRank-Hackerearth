import java.util.*;
import java.lang.Math;
public class FindProduct{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int in = scan.nextInt();
		double a=1;
		double tmp=1;
		for(int i=0;i<in;i++){
			a = scan.nextInt();
			 tmp = ((tmp*a)%(Math.pow(10,9)+7));
		}
		System.out.println((int)tmp);
	}
}