import java.util.*;
public class RepeatandMissingNumberArray{
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        long sum = 0;
        int dup =0;
     HashMap<Integer,Integer> map  = new HashMap<Integer,Integer>();
     for(int i=0;i<A.size();i++){
            if(map.containsKey(A.get(i))){
             arr.add(A.get(i));
             dup = A.get(i);
             break; 
            }
            else{
                map.put(A.get(i),1);
            }
     }
    // System.out.println("duplicate "+dup);
     long size = A.size();
     for(int i=0;i<A.size();i++){
        sum = sum + A.get(i);
     }
     sum = sum - dup;
     //System.out.println(sum);
     long max = ((size) * (size+1))/2;
     long val  = max-sum;
     arr.add((int)val);
     return arr;
    }
    public static void main(String args[]){
        ArrayList<Integer> app  = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        int in = scan.nextInt();
        for(int i=0;i<in;i++){
            app.add(scan.nextInt());
        }
        System.out.println(repeatedNumber(app));
    }
}