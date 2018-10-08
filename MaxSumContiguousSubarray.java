//Kadanes Algorithm

import java.util.*;
class MaxSumContiguousSubarray{
	public static int maxSubArray(final List<Integer> A) {
		int size = A.size();
		int max =A.get(0);
		int sum = A.get(0);
		for(int i=1;i<size;i++){
			sum  = Math.max(A.get(i),sum + A.get(i));
			max = Math.max(max,sum);
		}
		return max;
    }
	public static void main(String args[]){
		Scanner scan =new Scanner(System.in);
		int in = scan.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int ans =0;
		for(int i=0;i<in;i++){
			arr.add(scan.nextInt());
		}
		ans = maxSubArray(arr);
		System.out.println("Max sum subarray is "+ans);
	}
}