import java.util.*;
import java.lang.*;
class SwapWord{
	public static void main(String args[]){
		String str = "geeks for geeks";
		String[] str1 = str.split(" ");
		for(int i=0;i<str1.length;i++){
			int length = str1[i].length();
			char[] a = str1[i].toCharArray();
			char temp = a[length-1];
			a[length-1] = a[0];
			a[0]  = temp;
			for(int j =0;j<length;j++){
				System.out.print(a[j]+"");

			}
			System.out.print(" ");
		}
	}
}