import java.io.*;
import java.util.*;
import java.lang.*;
public class SeatingArrangement
{
	public static void main(String args[]) throws IOException{
	Scanner scan = new Scanner(System.in);
	int input = scan.nextInt();
	int in[] = new int[100000];
	String pos[]  =new String[100000];
	for(int j=0;j<input;j++){
		in[j] = scan.nextInt();
			int rem1=in[j]%6;
			int rem2 = in[j]%12;
			if(rem1==0){
				rem1=6;}
				if(rem2==0){
				rem2=12;}
				int d = 13-rem2;
				int sum = rem2-d;
				sum = Math.abs(sum);

			if(rem1==1 | rem1==6){
				if(d>rem2){in[j] = in[j]+sum;}
				else{in[j] = in[j]-sum;}
				pos[j] = "WS";
			}

			if(rem1==5 |rem1== 2){
				if(d>rem2){in[j] = in[j]+sum;}
				else{in[j] = in[j]-sum;}
					pos[j]  ="MS";
			}

					if(rem1==4 | rem1==3){
					if(d>rem2){in[j] = in[j]+sum;}
					else{in[j] = in[j]-sum;}
					pos[j]  ="AS";

		}
	}
	for(int k=0;k<input;k++){
		System.out.println(in[k]+" "+pos[k]);
	}
	System.exit(0);
}
}