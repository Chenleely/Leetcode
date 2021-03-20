package answer;

public class num_5 {

    /* 
    *考虑暴力解的情况：
    *  列举出s的每一个子串，再进行比较，这样做的话对于一个长度为n的字符串来说，其可能存在的子串
    *长度为1：n     长度为2:n/2     长度为n:1
    *这样得到的排列组合再判断是否是回文子串，时间复杂度在o(n^2)，且空间复杂度也为O(n^2)
    */

    //解法1：动态规划求解：
    /* 
    *解题思路：
    *ch[n]为字符数组
    *dp[i][j]表示i到j的一个子串，如果dp[i][j]为true，代表是回文子串
    *因此，如果我们要判断dp[i][j]是不是回文子串，当ch[i]=ch[j]时，如果dp[i+1][j-1]为true，那么dp[i][j]也为true
    *边界条件：j-1-(i+1)+1<2，即最小的切分子串为长度为2，得到j-i<3
    *         当ch[i]==ch[j]，并且满足j-i<3，可以直接得到dp[i][j]=true
    *初始化：长度为1的所有子串都是回文子串
    */
    public String longestPalindrome(String s) {
        char[] ch=s.toCharArray();
        int length=ch.length;
        int leftindex=0;
        int maxLen=1;
        boolean[][] dp=new boolean[length][length];
        //特例
        if(length<2){return s;}
        
        //初始化
        for(int i=0;i<length;i++){
            dp[i][i]=true;
        }

        for(int j=1;j<length;j++){
            for(int i=0;i<j;i++){
                if(ch[i]==ch[j]){
                    //长度小于3直接确定为true，否则就要看去掉i、j以后子串的情况
                    if(j-i<3){
                        dp[i][j]=true;
                    }else{
                        dp[i][j]=dp[i+1][j-1];
                    }
                }else{
                    dp[i][j]=false;
                }
                //通过比较当前回文串长度和已经得到的最大长度，从而得到新的左边界和长度
                if(dp[i][j]==true&&j-i+1>maxLen){
                    maxLen=j-i+1;
                    leftindex=i;
                }
            }
        }
        return s.substring(leftindex,leftindex+maxLen);
    }
    
    //解法2：中心扩展算法
    /* 
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    */

    
}
