import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        str=sc.nextLine();
        boolean result=false;
        for(int i=0;i<str.length()/2;i++){
            if (str.charAt(i )!= str.charAt(str.length()-1-i)){
               
                result=false;
                break;
            }
            else{
                result=true;
                }
        }
        if (result==false){
            System.out.println("not palindrome");
        }
        else{
            System.out.println(" palindrome");
        }


        }
}
