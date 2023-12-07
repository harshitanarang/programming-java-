import java.util.*;
public class shortestpath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float x=0,y=0;
        char ch;
        String d;
        float distance;
        System.out.println("enter directions:");
        d=sc.nextLine();
        for(int i=0;i< d.length();i++){
            ch=d.charAt(i);
            if(ch=='N'){
                y++;
            }
            else if(ch=='S'){
                y--;
            }
            else if(ch=='E'){
                x++;
            }
            else{
                x--;
            }


        }
     float X2=x*x;
     float Y2=y*y;
     distance=(float)(Math.sqrt(X2+Y2));
     System.out.println(distance);

        

    }
}
