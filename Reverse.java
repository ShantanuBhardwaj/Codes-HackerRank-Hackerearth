import java.util.*;
import java.lang.*;
class Reverse{
	public static void main(String args[]){
		StringBuffer a = new StringBuffer("occurence");
		int[] flag = new int[a.length()];
		for(int i=0;i<a.length();i++){
				flag[i] = 0;
		}
		for(int i=0;i<a.length();i++){
			int count =0;
			for(int j=0;j<a.length();j++){
				if(a.charAt(i)==a.charAt(j) && flag[j]==0){
						count++;
						flag[j] =1;
				}
			}
			if(count==0);
			else{
			System.out.println(count);
		}
	}
	}
}