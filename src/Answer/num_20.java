package answer;

import java.util.Stack;

public class num_20 {
    public boolean isValid(String s) {
        char symbol[]=s.toCharArray();
        Stack<Character> stack=new Stack<>();
        char ch1,ch2;
        if(symbol.length!=0){
            for(char chars:symbol){
                if(stack.size()==0){
                    stack.push(chars);
                }else if(isSym(stack.peek(),chars)){
                    stack.pop();
                }else {
                    stack.push(chars);
                }
            }
        }

        return stack.size()==0;//thinking:the use of hashmap to make the searching process faster.
    }//problem:occupation of internal storage is too high.
    public boolean isSym(char ch1,char ch2){
        return ((ch1=='{'&& ch2=='}')||(ch1=='['&& ch2==']')||(ch1=='('&& ch2==')'));
    }
}


