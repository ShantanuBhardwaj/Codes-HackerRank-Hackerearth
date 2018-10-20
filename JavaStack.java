import java.io.*;
import java.util.*;
class JavaStack{
		public static void main(String args[]){
			Scanner scan = new Scanner(System.in);
			//int in = scan.nextInt();
			//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while(scan.hasNext())
			{
			Stack<Character> stack = new Stack<Character>();
			String input = scan.next();
			char[] arr  = input.toCharArray();
			for(Character ch:arr){
				Character check='a';
				if(stack.isEmpty()){
					if(ch=='}' || ch==')' || ch== ']' ){
						stack.push(ch);
						break;
					}
					stack.push(ch);
				}
				else{
					if(ch=='}'){
						check='{';
					}
					if(ch=='{'){
						check='}';
					}
					if(ch=='['){
						check=']';
					}
					if(ch==']'){
						check='[';
					}
					if(ch=='('){
						check=')';
					}
					if(ch==')'){
						check='(';
					}
					char top = stack.peek();
					if(top==check){
						stack.pop();
					}
					else{
						stack.push(ch);
					}
				}
			}
		//	System.out.println(stack);
			if(stack.isEmpty())
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
		}
			
		}
}