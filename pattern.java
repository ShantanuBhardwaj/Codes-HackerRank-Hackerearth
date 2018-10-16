import java.util.*;
class pattern{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int in = scan.nextInt();
		for(int i=0;i<in;i++){System.out.print(" ");}
		System.out.print("*");
		for(int i=0;i<in;i++){System.out.print("@");}
		System.out.println();
		int fin=in-1;
		for(int k=3;k<=in;k=k+2){
			for(int j=fin;j>=1;j--){System.out.print(" ");}
			fin  = fin-1;
			for(int i =0;i<k;i++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int k=in-2;k>=3;k=k-2){
			for(int j=fin+2;j>=1;j--){System.out.print(" ");}
			fin = fin+1;
				for(int i=0;i<k;i++){System.out.print("*");}
				System.out.println();
		}









		for(int j=0;j<in;j++){System.out.print("@");}
		System.out.print("*");
	}
}
