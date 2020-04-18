package answer;

public class num_647 {
    public int countSubstrings(String s) {
        int len=s.length();
        int i,j,num;
        char[] cur=s.toCharArray();
        boolean[][] dp=new boolean[len][len];
        num=len;
        for(i=0;i<len;i++){
            dp[i][i]=true;
        }
        for(j=1;i<len;j++){
            for (i=0;i<j;i++){
                if(cur[i]==cur[j]){
                        dp[i][j]=true;
                        dp[i][j]=dp[i+1][j-1];
                }else {
                    dp[i][j]=false;
                }

                if(dp[i][j]){
                    num+=1;
                }
            }
        }
        return num;
    }
}
