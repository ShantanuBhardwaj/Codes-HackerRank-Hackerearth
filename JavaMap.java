import java.util.*;
import java.io.*;
class JavaMap{
	public static void main(String args[])throws IOException{
		//Scanner scan = new Scanner(System.in);
		int count=0;
		//System.out.println()

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int in = Integer.parseInt(br.readLine());
		Map<String,String> map  =new HashMap<String,String>();
		//map.put("a",1);
		//map.put("b",3);
		while(in--!=0){
			String str = br.readLine();
			//System.out.println(str);
			//System.out.println(++count);
			String val = br.readLine();
			map.put(str,val);
		}
		String stt;
		while((stt = br.readLine())!=null && stt.length()!=0){
			//String stt = scan.nextLine();
			if(map.containsKey(stt)){
				System.out.println(stt+"="+map.get(stt));
			}
			else{
				System.out.println("Not found");
			}

	}
		// String q;
  //       while(( q = br.readLine()) != null && q.length() != 0)
  //           {
  //           if(map.containsKey(q))
  //               {
  //               System.out.println(q+"="+map.get(q));
  //           }
  //           else
  //               {
  //               System.out.println("Not found");
  //           }
  //       }
	//catch(Excetion e){}
		//System.out.println(map);
	}
	}