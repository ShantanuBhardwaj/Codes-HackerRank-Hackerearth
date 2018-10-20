import java.io.*;
import java.util.*;

public class JavaList{

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int in = scan.nextInt();
       List<Integer> arr = new ArrayList<Integer>();
       for(int i=0;i<in;i++){
       		arr.add(scan.nextInt());
       }
       int oper = scan.nextInt();
       int count=0;
       while(oper--!=0){
       	//System.out.println(++count);
       		//scan.nextLine();
       		String str = scan.next();
       		 if(str.equals("Insert"))
       		 {
       			//scan.nextLine();
       		 	int index = scan.nextInt();
       		 	int val = scan.nextInt();
       		 	arr.add(index,val);
       		 }
       		if(str.equals("Delete"))
       		{
       			//scan.nextLine();
       			//System.out.println("******");
       			int input = scan.nextInt();
       			arr.remove(input);
       		}
       		//System.out.println(++count);
       }
       for(Integer item:arr){
       	System.out.print(item+" ");
       } 
    }
}