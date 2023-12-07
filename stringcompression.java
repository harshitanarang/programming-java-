import java.util.*;
public class stringcompression {
    public static void main(String[] args) {
        String str;
        
        String newstr="";
        System.out.println("enter string:");
        Scanner sc =new Scanner(System.in);
        str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 &&str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
        newstr += str.charAt(i);
        if(count>1){
            newstr += count.toString();
        }

        }
    System.out.println(newstr);


    }

}

