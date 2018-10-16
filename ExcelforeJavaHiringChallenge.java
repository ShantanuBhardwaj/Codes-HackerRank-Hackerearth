import java.util.*;
class ExcelforeJavaHiringChallenge{
	public static void  main(String[] args) {
			Scanner scan  =  new Scanner(System.in);
			int input = scan.nextInt();
			
		while(input--!=0){
			int N  = scan.nextInt();
			long P = scan.nextLong();
			long[] arr = new long[N];
			for(int i=0;i<N;i++){
				arr[i] = scan.nextLong();
			}
			for(int i =0;i<N;i++){
				long val = arr[i];
				if(P >=  val){
					P = P - val;
					if(P>=0 && i==(N-1)){
						System.out.println("Yes "+P);
					}
					arr = decre(arr,i,N);
				}
				else{
					System.out.println("No");
					break;
				}
			}
		}
	}
	public static long[] decre(long[] al,int time,int N){
		int check = time;
		for(int i=time+1;i<N;i++){
			if(al[i]%2==0 && check%2==0){
				al[i] = al[i] -1;
			}
			if(al[i]%2!=0 && check%2!=0){
				al[i] = al[i]-1;
			}
		}
		return al;
	}
	
}