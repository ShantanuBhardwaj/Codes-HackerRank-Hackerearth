class LongestRepeatedSubsequence{
	public static void main(String args[]){
		StringBuffer sb = new StringBuffer();
		String g = "AABEBCDD";
		char[] s = g.toCharArray();
		int[]  flag = new int[s.length];
		int count=0;
		for(int i=0;i<s.length;i++){
			flag[i]=0;
		}
		for(int i=0;i<s.length;i++){
				flag[i]=1;
			for(int j=0;j<s.length;j++){
				if(s[i]==s[j] && flag[j]==0){
					count++;
					flag[j]=1;
				}
			}
			if(count!=0){
				sb.append(s[i]);
				count=0;
			}
		}
		System.out.println(sb);
	}
}