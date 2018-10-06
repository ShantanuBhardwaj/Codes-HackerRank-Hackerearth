import java.util.*;
import java.lang.*;
class FirstCharacterUpper{
	public static void main(String args[]){
			String a = "GFG";
			int len = a.length();
			for(int i=0;i<len;i++){
				 if(i==0){
				 char given = a.charAt(i);
				  given = Character.toUpperCase(given);
				 System.out.print(given);
				}
				else{
					char g = a.charAt(i);
					System.out.print(Character.toLowerCase(g));
				}
			}
	}
}