import java.util.*;
public class  Combination{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int[] arr = new int[x];
        int counter = 0;
        for(int i=0;i<x;i++){
            arr[i] = scan.nextInt();
            if(arr[i]==0){
                count++;
            }
        }
        int place = scan.nextInt();
        int len = arr.length() +1;
        for(int i=0;i<(place-1);i++){
            place = place * (len-i);
        }
        for(int i=0;i<(place-1);i++){
            
        }
    }
}