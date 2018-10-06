import java.util.*;
public class PalindromicString{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		char[] new_a = a.toCharArray();
		int length =0;
		if(new_a.length%2==1){
			length=new_a.length+1;
		}
		else{
		    length = new_a.length/2;
		}
		int count =0;
		int len1 = new_a.length;
		for(int i=0;i<(length/2);i++){
			if(new_a[i]==new_a[len1-1-i]){
				count++;
			}
		}
		if(count==length/2){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}
}