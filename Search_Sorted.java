import java.util.*;
class Search_Sorted{
	public static void main(String args[]){

		BufferedReader br = new BufferedReader(new InputStream(System.in));
		String[] a = br.readLine().split(" ");
		int[] b  = new int[a.length()]; 
		for(int i=0;i<a.length;i++){
			b[i] = Integer.parseInt(a[i]);
		}
		Scanner scan = new Scanner();
		int key = scan.nextInt();
		Integer index;
		if(a.length%2==0){
			index = ((a.length+1)/2);
		}
		else{
			index = (a.length/2);
		}
			if(key>=b[0]){
				for(int i=o;i<=index;i++)
				{
						
				}
			}
			if(key<=b[a.length-a]){

				}
			}