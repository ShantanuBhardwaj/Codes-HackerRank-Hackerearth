import java.util.*;
public class Rover{
		public static int roverMove(int matsize,List<String> cmds)
		{
		int row=0;
		int col =0;
		for(int i=0;i<cmds.size();i++){
			if(cmds.get(i).equals("RIGHT") && col<(matsize-1)){
				col = col+1;
			}
			if(cmds.get(i).equals("LEFT") && col>0){
				col = col-1;
			}
			if(cmds.get(i).equals("UP") && row>0){
				row  = row-1;
			}
			if(cmds.get(i).equals("DOWN") && row<(matsize-1)){
				row  = row+1;
			}
		}
		return ((row*matsize)+col);
	}
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int matrix_size = scan.nextInt();
		List<String> moveCode = new ArrayList<String>();
		int n=scan.nextInt();
		while(n-->0)
		{
			moveCode.add(scan.next());
		}

		int ans = roverMove(matrix_size,moveCode);
		System.out.println(ans);
	}
}
