import java.util.*;
public class anagramstring {
    public static void main(String[] args) {
        String str1="earth";
        String str2="heart";
        str1.toLowerCase();
        str2.toLowerCase();
        if(str1.length()==str2.length()){
            char array1[]=str1.toCharArray();
            char array2[]=str2.toCharArray();
            Arrays.sort(array1);
            Arrays.sort(array2); 
            if(Arrays.equals(array1,array2)){
                System.out.println(str1+" and "+str2+" are anagrams of each other");
            }  
            else{
                System.out.println(str1+" and "+str2+" are not anagrams of each other");
            }         
        }
        else{
            System.out.println(str1+" and "+str2+" are not anagrams of each other");

        }
    }
    
}
