import java.io.*;
import java.util.*;
import java.lang.*;
public class SeatingArrangement1
{
	public static void main(String args[]) throws IOException{
	Scanner scan = new Scanner(System.in);
	int input = scan.nextInt();
	int a = new Int();
	for(int j=0;j<input;j++){
		 a = scan.nextInt();
			int rem1=a%6;
			int rem2 = a%12;
			if(rem1==0){
				rem1=6;}
				if(rem2==0){
				rem2=12;}
				int d = 13-rem2;
				int sum = rem2-d;
				sum = Math.abs(sum);

			if(rem1==1 | rem1==6){
				if(d>rem2){a = a+sum;}
				else{a = a-sum;}
				String pos = "WS";
			}

			if(rem1==5 |rem1== 2){
				if(d>rem2){a = a+sum;}
				else{a = a-sum;}
					String pos  ="MS";
			}

					if(rem1==4 | rem1==3){
					if(d>rem2){a = a+sum;}
					else{a = a-sum;}
					String pos  ="AS";

		}
		System.out.pritnln(a+" "+pos);
	}
	}
}
