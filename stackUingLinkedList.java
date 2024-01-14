import java.util.*;
public class stackUingLinkedList {

    static class Node{
            int data;
            Node next;
            Node(int data){
                this.data= data;
                this.next=null;
            }
        }
    static class Stack{
        static Node head=null;
        //empty
        public static boolean  isEmpty(){
            return head == null;
            
        }
        //push
        public static void push(int data){
            Node newnode=new Node(data);
            if(isEmpty()){
                head=newnode;
                return;
            }
            else{
                newnode.next=head;
                head= newnode;
            }
        
    }
        //pop
        public static int pop(){
            if(isEmpty()){
                return-1;
            }
            else{
            int top=head.data;
            head=head.next;
            return top;
        }
    }
        //peek
        public static int peek(){
            if(isEmpty()){
                return-1;
            }
            else{
                 return head.data;

            }
           
            
        }
            

    }
    public static void main(String[] args) {
        Stack s =new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        
    }
}
    
