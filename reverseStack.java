import java.util.*;

public class reverseStack {
    static class StackB{
        // reverse stack
        public static void revstack(Stack<Integer> s){
            if(s.isEmpty()){
                return;
            }

           int top=s.pop();
            revstack(s);
            pushAtBottom(s,top);

        }

        //push at bottom
        public static void pushAtBottom(Stack<Integer> s ,int data){
            if(s.isEmpty()){
                s.push(data);
                return;
            }
            int top = s.pop();
            pushAtBottom(s,data);
            s.push(top);

        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        StackB.revstack(s);
        while(!s.isEmpty()){
              System.out.println(s.peek());
              s.pop();
        }
        
    }
    
}
