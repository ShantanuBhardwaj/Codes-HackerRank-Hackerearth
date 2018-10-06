public class Solution {
    public int coverPoints(int[] A, int[] B) {
    }
}
import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
            int in= scan.nextInt();
            int x[] = new int[in+1];
            int y[] = new int[in+1];
            for(int i=0;i<in;i++){
                x[i] = scan.nextInt();
                y[i] = scan.nextInt();
            }

            int i=0;
            int count=0;
            while(in!=0){
                if(x[i]==x[i+1] || (x[i]-1==x[i+1]) || (x[i]+1==x[i+1])){
                    if(y[i]==y[i+1] || (y[i]-1==y[i+1]) || (y[i]+1==y[i+1])){
                            count++;
                            //System.out.println(""+x[i]+""+y[i])
                    }
                }
                in--;
                i++;
            }
            System.out.println(count);
    }