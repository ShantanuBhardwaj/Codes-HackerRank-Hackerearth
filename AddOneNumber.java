import java.util.*;
class AddOneNumber12{
	public static ArrayList<Integer> addone(ArrayList<Integer> a){
		int i=0;
		while(i<a.size()-1 && a.get(i)==0){
			a.remove(i);
		}
		int index = a.size()-1;
	//	int j=1;
		while(index>=0){
			//System.out.println(a.get(a.size()-1));
			if(a.get(index)<9){
				int k = a.get(index) +1;
				a.set(index,k);
				break;
			}
			else{
					a.set(index,0);
					if(index==0 && a.get(index)==0){
					//a.add(0);
					a.add(0,1);
				}
					index--;
				}
			}
				return a;		
		}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int input=  scan.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0;i<input;i++){
			arr.add(scan.nextInt());
		}
		arr  = addone(arr);
		System.out.println(arr);
	}
}
