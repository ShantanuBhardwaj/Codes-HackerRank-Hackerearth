import java.util.*;
import java.lang.*;
public class ToggleString{
	public static void check(char[] a){
		for(int i=0;i<a.length;i++){
			if(Character.isUpperCase(a[i])){
				System.out.print(Character.toLowerCase(a[i]));
			}
			else{
				System.out.print(Character.toUpperCase(a[i]));
			}
		}
	}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String new_a  = scan.next();
		char[] a  = new_a.toCharArray();
		check(a);
	}
}