import java.util.*;
class JavaEndOfFile{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int count = 0;
		while(scan.hasNext()){
			String ng  = scan.nextLine();
			System.out.println(count +" "+ng);
			count++;
		}
	}
}