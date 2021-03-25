package array;

import jdk.internal.dynalink.ChainedCallSite;

public class IsPalindrom{
    //
    //转换为新的字符串修改
    //
    public boolean isPalindrome(String s) {
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                builder.append(Character.toLowerCase(ch));
            }
        }
        int i,j;
        i=0;j=builder.length()-1;
        while(i<j){
            if(builder.charAt(i)==builder.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
    //
    //原字符串上修改
    //
    public boolean isPalindrome_1(String s) {
        int i,j;
        i=0;j=s.length()-1;
        while(i<j){
            char chi=s.charAt(i);
            char chj=s.charAt(j);
            if(Character.isLetterOrDigit(chi)&&Character.isLetterOrDigit(chj)){
                chi=Character.toLowerCase(chi);
                chj=Character.toLowerCase(chj);
                if(chi==chj){
                    i++;
                    j--;
                }else{
                    return false;
                }
            }else if(!Character.isLetterOrDigit(chi)){
                i++;
            }else if(!Character.isLetterOrDigit(chj)){
                j--;
            }
        }
        return true;
    }
}