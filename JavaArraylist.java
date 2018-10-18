import java.io.*;
import java.util.*;
class JavaArraylist
{
public static void main(String[] args)
    {
       Scanner scan = new Scanner(System.in);
 	  int in = scan.nextInt();
 	  scan.nextLine();
      List<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>(in);
      for(int i=0;i<in;i++)
      {
      	String num1  = scan.nextLine();
      	String array[]=num1.split(" ");
      	arr.add(new ArrayList<Integer>());
      	for(int j=0;j<array.length;j++)
      	{
      		arr.get(i).add(Integer.parseInt(array[j]));
      	}
      }
      int check = scan.nextInt();
      while(check--!=0)
      {
      	int a = scan.nextInt();
      	int b = scan.nextInt();
      	try{
      		System.out.println(arr.get(a-1).get(b-1));
      	}
      	 catch(Exception e){
      	 		System.out.println("ERROR!");
      	 }
      	//scan.nextInt();
      }
    }
}