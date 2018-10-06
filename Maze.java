import java.util.*;
class Maze{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int sum =scan.nextInt();
		int in = scan.nextInt();
		//System.out.print("4");
		for(int i=1;i<in;i++){
			if(i%2!=0){
				sum=sum + 5;
				//System.out.print(" "+sum);
			}
			else{
				sum = sum-2;
				//System.out.print(" "+sum);
			}
		}
		System.out.println(sum);
	}
}