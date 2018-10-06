import java.util.*;
import java.lang.Math.*;
class SingleDigit{
		public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int a[] = new int[10];
		String s = Integer.toString(input);
		int count = s.length();
		//int flag = 0;  //while cond flag!=s.length()-1;
		while(count!=-1){
		for(int i=0;i<count-1;i++){
			int a1 = Integer.parseInt(Character.toString(s.charAt(i)));
			int b = Integer.parseInt(Character.toString(s.charAt(i+1)));
			a[i] = Math.abs(b-a1);
		}
		count--;
		//flag++;
}
System.out.println(a[0]);
}
}