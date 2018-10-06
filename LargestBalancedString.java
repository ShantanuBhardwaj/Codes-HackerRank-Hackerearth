import java.util.*;
class LargestBalancedString{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int in = scan.nextInt();
		while(in!=0){
		String input = scan.next();
		char[] arr =  input.toCharArray();
		int[] flag = new int[arr.length];
		for(int j=0;j<arr.length;j++){
			flag[j] = 0;
		}
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]=='{' && flag[i]==0){
				flag[i] =1;
				for(int k=0;k<arr.length;k++){
					if(arr[k]=='}' && flag[k]==0){
						count = count+2;
						flag[k] = 1;
						break;
					}
				}
			}
			if(arr[i]=='[' && flag[i]==0){
				//System.out.println("LOOP2");
				flag[i] =1;
				for(int k=0;k<arr.length;k++){
					if(arr[k]==']' && flag[k]==0){
						count = count+2;
						flag[k] = 1;
						break;
					}
				}
			}
			if(arr[i]=='(' && flag[i]==0){
				//System.out.println("LOOP3");
				flag[i] =1;
				for(int k=0;k<arr.length;k++){
					if(arr[k]==')' && flag[k]==0){
						count = count+2;
						flag[k] = 1;
						break;
					}
				}
			}
		}
		System.out.println(count);
		in--;
	}
}
}