import java.io.*;
import java.util.*;

public class JavaSubarray{

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
       int in = scan.nextInt();
       int[] arr = new int[in];
       for(int i=0;i<in;i++)
       {
       		arr[i] = scan.nextInt();
       }
       int sum = 0;
       int count = 0;
       for(int i =0;i<in;i++){
       		sum = 0;
       		for(int j=i;j<in;j++){
       			sum  = sum + arr[j];
       			if(sum<0){
       				count++;
       		}
       }
       		}
       		
       System.out.println(count);
    }
}