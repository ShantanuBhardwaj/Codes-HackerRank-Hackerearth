import java.util.*;
class AlphabetChocolate{
		static int calc(String arr,int i,int j){
			int count =0;
			for(int k=i;k<=j;k++){
				char in = arr.charAt(k);
				if(in=='a' || in=='e' || in=='i' || in=='o' || in=='u'){
					count++;
				}
			//	System.out.println(i+" "+j);
			}
			return count;
		}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		
		while(input!=0)
	{
		String sb = scan.next();
		sb.toLowerCase();
		int sum = 0;
		for(int i=0;i<sb.length();i++){
			for(int j=i;j<sb.length();j++){
				sum  = sum + calc(sb,i,j);
			}
		}
		System.out.println(sum);
		input--;
	}
}
}