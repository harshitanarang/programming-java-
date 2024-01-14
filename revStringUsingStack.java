import java.util.*;
public class revStringUsingStack {
    static class StackB{
         public static String revstring(String str){
            Stack<Character> s=new Stack<>();
            int i=0;
            while(i<str.length()){
                s.push(str.charAt(i));
                i++;

            }
            StringBuilder result=new StringBuilder(" ");
            while(!s.isEmpty()){
                char curr= s.pop();
                result.append(curr);
            }
             return result.toString();
            
         }
        

        }
    public static void main(String[] args) {
        String str="abcd";
        String result =StackB.revstring(str);
        System.out.println(result);
        
    }
    
}
