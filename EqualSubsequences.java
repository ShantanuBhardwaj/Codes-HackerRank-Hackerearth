import java.util.*;
class EqualSubsequences{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String seq = scan.next();
		int len = seq.length();
		String A = new String();
		String B = new String();
		if(len%2!=0){
			int len1 = (len+1)/2;
			 A = seq.substring(0,len1);
			 B = seq.substring(len1);
		}
		if(len%2==0){
			int len2=(len)/2;
			A = seq.substring(0,len2);
			B = seq.substring(len2);
		}
		//System.out.println(A);
		//System.out.println(B);
		int count=0;
		int[] flag = new int[B.length()];
		for(int i=0;i<A.length();i++){
			for(int j=0;j<B.length();j++){
				if(A.charAt(i)==B.charAt(j) && flag[j]==0){
					count++;
					flag[j]=1;
				}
			}
		}
		System.out.println(count);
	}
}