package Answer;

public class num_1143 {
    public int longestCommonSubsequence(String text1, String text2) {
        int m,n;
        char[] a=text1.toCharArray();m=a.length;
        char[] b=text2.toCharArray();n=b.length;
        int i,j;
        int[][] curr=new int[m+1][n+1];
        for(i=0;i<=m;i++){
            curr[i][0]=0;
        }
        for(j=0;j<=n;j++){
            curr[0][j]=0;
        }
        for(i=1;i<=m;i++){
            for(j=1;j<=n;j++){
                if(a[i-1]==b[j-1]){//由于curr[][]的0行0列没有使用，curr[][]的第i行元素对应str1的第i-1个元素
                    curr[i][j]=curr[i-1][j-1]+1;
                }else if(curr[i-1][j]>=curr[i][j-1]){
                    curr[i][j]=curr[i-1][j];
                }else {
                    curr[i][j]=curr[i][j-1];
                }
            }
        }
        return curr[m][n];
    }
}
