import java.util.*;

public class duplicateParentheses {
    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();
    for(int i=0;i<str.length();i++){
        char ch= str.charAt(i);
        if(ch==')'){
            int count=0;
            while(s.peek()!='('){
                s.pop();
                count++;
            }
            if(count<1){
                return true;//duplicate found
            }
            else{
                s.pop();
            }

        }
        else{
            s.push(ch);
        }
    }
    return false;//no duplicate

    }
    
    public static void main(String[] args) {
        String str="((a+b-c)+(a+b-c))";//no duplicate
        System.out.print(isValid(str));
        
    }
    
}
