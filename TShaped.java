import java.util.*;
class TShaped{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int in=scan.nextInt();
		int[] x = new int[5];
		int[] y = new int[5];
		while(in!=0){
			int out1 = 0;
			int out2 = 0;
			for(int i=0;i<5;i++){
				 x[i] =  scan.nextInt();
				 y[i] = scan.nextInt();
			}
			HashMap<Integer,Integer> map = new HashMap<>();
			for(int l=0;l<x.length;l++)
			{
				if(map.containsKey(x[l]))
				{
						int k = map.get(x[l]);
						map.put(x[l],k+1);
				}
				else{
					map.put(x[l],1);
				}
			}
			for(int l=0;l<x.length;l++){
				if(map.get(x[l])==3){
					if(map.containsKey(x[l]+1)){
							if(map.containsKey(x[l]+2)){
								out1=1;
							}
					}
					if(map.containsKey(x[l]-1)){
							if(map.containsKey(x[l]-2)){
								out1=1;
							}
					}
					if(map.containsKey(x[l]-1)){
						if(map.containsKey(x[l]+1)){
							out1=1;
						}
					}
				}
			}
			HashMap<Integer,Integer> map1 = new HashMap<>();
			for(int l=0;l<y.length;l++)
			{
				if(map1.containsKey(y[l]))
				{
						int k = map1.get(y[l]);
						map1.put(y[l],k+1);
				}
				else{
					map1.put(y[l],1);
				}
			}
			for(int l=0;l<y.length;l++){
				if(map1.get(y[l])==3){
					if(map1.containsKey(y[l]+1)){
							if(map1.containsKey(y[l]+2)){
								//System.out.println("yeee");
								out2=1;
							}
					}
					if(map1.containsKey(y[l]-1)){
							if(map1.containsKey(y[l]-2)){
								out2=1;
							}
					}
					if(map.containsKey(x[l]-1)){
						if(map.containsKey(x[l]+1)){
							out2=1;
						}
					}
				}
			}
			//System.out.println(map);
			//System.out.println(map1);
			if(out1==1 && out2==1){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
		in--;
		}
	}
}