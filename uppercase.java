import java.util.*;
public class uppercase {
    public static void main(String[] args) {
        StringBuilder str2=new StringBuilder();
        String str="harshita narang is selected in google";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                str2.append(str.charAt(i));
                i++;
                str2.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                str2.append(str.charAt(i));
            }
        }
        System.out.print(str2.toString());
    }
    
}

