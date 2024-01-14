import java.util.*;
public class palindromeUsingStack {
    static class Node{
        char data;
        Node next;
        Node( char data){
            this.data=data;
            this.next=null;
        }
    }
    public static boolean isPalindrome(Node head){
       Stack<Character> s= new Stack<>();
       Node current=head;
       while(current!=null){
        s.push(current.data);
        current=current.next;
       }
       current=head;
       while(!s.isEmpty() && current!=null){
       char top=s.pop();
        if( top == current.data){
           current=current.next;
        }
        else{
            return false;
        }
       }
       return true;
    }
    
    public static void main(String[] args) {
        //linked list creation
        Node one=new Node('D');
        Node two=new Node('E');
        Node three=new Node('N');
        Node four=new Node('N');
        Node five=new Node('E');
        Node six=new Node('D');
        one.next=two;
        two.next=three;
        three.next=four;
        four.next=five;
        five.next=six;
        six.next=null;
        Node head=one;
        Node current=head;

        //linked list printing before checking palindrome
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println();
        System.out.print(isPalindrome(one));



        

        
    }
    
}
