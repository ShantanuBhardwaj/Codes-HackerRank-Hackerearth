import java.util.*;
public class Anagram{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int count=0;
		for(int i=0;i<input;i++){
			String a = scan.next();
			String b = scan.next();
			int flag[] = new int[10000];
			char[] new_a = a.toCharArray();
			char[] new_b = b.toCharArray();
		//	System.out.println("length of a"+new_a.length);
		//	System.out.println("length of b"+new_b.length);
			for(int l=0;l<new_b.length;l++){
				flag[l]=0;
			}
			for(int j=0;j<new_a.length;j++){
				for(int k=0;k<new_b.length;k++){
					if(new_a[j]==new_b[k] && flag[k]==0){
						count++;
						flag[k]=1;
						break;
					}
				}

			}
			count = new_a.length+new_b.length-(count*2);
				System.out.println(count);
				count=0;
		}
	}
}