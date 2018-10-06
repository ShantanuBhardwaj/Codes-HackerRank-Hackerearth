import java.util.*;
class sweet{
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int in = scan.nextInt();
    int sum = 0;
    int arr[] = new int[in];
    for(int i=0;i<in;i++){
        arr[i] = scan.nextInt();
    //   sum = sum + (arr[i]*arr[i]);
    }
    for(int i=0;i<arr.length;i++){
        for(int k=0;k<=i;k++){
            sum = sum + arr[k]*arr[i];
        }
    }
    System.out.println(sum);
}
}