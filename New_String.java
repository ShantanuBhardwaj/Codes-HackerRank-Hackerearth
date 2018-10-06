import java.util.*;
import java.lang.*;
class New_String
{
	public static void main(String args[])
	{
			Scanner scan = new Scanner(System.in);
			String input  = scan.nextLine();
		//	input = input.trim();
			String[] str = input.split(" ");
			StringBuffer sb = new StringBuffer();
		//	StringBuffer out = new StringBuffer();
			int k=0;
		//	System.out.println(str[0]+""+str[1]);
		//	for(int i=0;i<str.length;i++)
		//	{
		//		k=0;
			for(int i=0;i<str.length;i++)
			{
				k=0;
				for(int j=str[i].length()-1;j>=0;j--)
				{
					int ascii = str[i].charAt(j);
					int a = ascii+k;
					if(a>122){a = a-122+97;}
					else{}
					char b = (char)a;
					sb.append(b);
					k++;
					// System.out.println(sb);
				}
		//	}
			System.out.println(sb);
		}
		Character a = new Character();
		System.out.println((int)a);
}

}