import java.util.*;
import java.lang.*;
public class RoyAndProfilePicture{
	public static void main(String args[]){
		Scanner scan  = new Scanner(System.in);
		int l = scan.nextInt();
		int no_photos = scan.nextInt();
		for(int i=0;i<no_photos;i++){
			int w  = scan.nextInt();
			int h  =scan.nextInt();
			if(w<l | h<l){
				System.out.println("UPLOAD ANOTHER");
			}
			if(w>=l && h>=l){
					if(w==h){
						System.out.println("ACCEPTED");
						}
					else{
						System.out.println("CROP IT");
					}
		}
	}
}
}