package array;

import java.util.Arrays;
import java.util.HashSet;

public class ReverseVowels{
    public String reverseVowels(String s) {
        if(s.equals("")){return s;}
        char[] chars=new char[s.length()];
        StringBuilder builder2=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                chars[i]='%';
                builder2.append(ch);
            }else if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                chars[i]='%';
                builder2.append(ch);
            }else{
                chars[i]=ch;
            }
        }
        builder2.reverse();
        for(int i=0,j=0;i<chars.length;i++){
            if(chars[i]=='%'){
                chars[i]=builder2.charAt(j);
                j++;
            }
        }
        return new String(chars);
    }
    //
    //双指针
    //
    public String reverseVowels_1(String s) {
        HashSet set=new HashSet<Character>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        int i,j;
        i=0;j=s.length()-1;
        char[] chars=s.toCharArray();
        while(i<j){
            char ch1=chars[i];
            char ch2=chars[j];
            if(!set.contains(ch1)){
                i++;
                continue;
            }
            if(!set.contains(ch2)){
                j--;
                continue;
            }
            if(set.contains(ch1)&&set.contains(ch2)){
                char tmp=chars[i];
                chars[i]=chars[j];
                chars[j]=tmp;
                i++;
                j--;
            }
            
        }
        return new String(chars);
    }
 }