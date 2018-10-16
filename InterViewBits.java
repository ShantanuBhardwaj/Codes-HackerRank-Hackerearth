import java.util.*;
class InterViewBits{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int N  = scan.nextInt();
		int Q  = scan.nextInt();
		String s1 = scan.next();
		char[] arr = s1.toCharArray();
		int L =0;
		int R =0;
		int K =0;
		int count =0;
		int index = 0;
		while(Q--!=0)
		{
			count=0;
			int in = scan.nextInt();
			if(in==1){
				L  =scan.nextInt();
				R  =scan.nextInt();
				K  =scan.nextInt();

				for(int i =(L-1);i<R;i++){
				      int val = arr[i];
				for(int j =i+1;j<R;j++){
					int check = arr[j];
					//System.out.print(" "+val+"-"+check);
					if(Math.abs(val-check)==K){count++;}
				}
			}
			System.out.println(count);
			}
			
			if(in==2){
			     index  = scan.nextInt();
			     char ch  = scan.next().charAt(0);
			     arr[index-1] = ch;
			     // for(int i=0;i<arr.length;i++){
			     // 	System.out.print(arr[i]+" ");
			     // }
			}
			
		}
			}
}

