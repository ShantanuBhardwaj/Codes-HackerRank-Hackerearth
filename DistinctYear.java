class DistinctYear{
	public static void main(String args[]){
		String in = "hello today the date is 01-03-1197";
		StringBuffer sb = new StringBuffer();
	//	String[] date =in.split(" ");
		int i=0; 
		while(in.charAt(i)!='-'){
			i++;
		}
		i = i+4;
		while(i<in.length()){
       	sb.append(in.charAt(i));
       i++;
		}
		System.out.println(sb); 
	}
}