import java.util.*;
class JumpingOnTheClouds{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int in = scan.nextInt();
		int[] flag = new int[in];
		for(int i = 0;i<in;i++){
			flag[i] = scan.nextInt();
		}
		int count=0;
		for(int i=0;i<in;){
					if((i+2)<in && flag[i+2]==0){
						i = i+2;
						count++;
					}
					else{
						if((i+1)<in && flag[i+1]==0){
							i = i+1;
							count++;
						}
					}
					if((in-1)==i){
					break;
				}
		}
		System.out.println(count);
	}
}