import java.util.*;
class Main{
	static int search(int arr[],int l,int h,int key){
		if(l>h)
			return -1;
		int mid = (l+h)/2;
		if(arr[mid]==key){
			return mid;
		}
		if(key<arr[mid] && key>arr[l]){
		//	System.out.println("1-- "+l+" "+(mid-1)+" "+key);
			return search(arr,l,mid-1,key);
		}
		else{
		//	System.out.println("2--"+(mid+1)+" "+h+" "+key);
			return search(arr,mid+1,h,key);
		}
	//	if(key<arr[mid] && key<arr[h])
	//		return search(arr,mid+1,h,key);
	//	else
	//		return search(arr,l,mid-1,key);
	} 
	
	public static void main(String args[]){
		int[] arr  = {1,2,3,4,5,6,7,8};
		int n = arr.length;
		int key = 2 ;
		int i = search(arr,0,n-1,key);
		if(i!=0)
			System.out.println("Key index found successfully "+i);
		else
			System.out.println("Key not found");
	}
}