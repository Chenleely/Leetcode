package answer;

public class num_5 {
    public String longestPalindrome(String s) {
        char[] cur=s.toCharArray();
        int i,j,start,maxlen,thislen,slenth;
        slenth=cur.length;
        if(slenth<2){
            return s;
        }
        boolean[][] dp=new boolean[slenth][slenth];
        start=thislen=0;maxlen=1;
        for(i=0;i<slenth;i++){
            dp[i][i]=true;
        }
        for(j=1;j<slenth;j++) {
            for (i = 0; i < j; i++) {
                if (cur[i] == cur[j]) {
                    if(j-i<3){
                    dp[i][j] = true;
                    }else {
                        dp[i][j]=dp[i+1][j-1];
                    }
                } else {
                    dp[i][j] = false;
                }
                if(dp[i][j]) {
                    thislen = j - i + 1;
                    if (thislen > maxlen) {
                        maxlen = thislen;
                        start = i;
                    }
                }
            }
        }
        return s.substring(start,start+maxlen);
    }
}
