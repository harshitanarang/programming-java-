import java.util.*;
public class decimaltobinary {
    public static void dectobin(int m){
        int bin=0;
        int pow=0;
        int n =m;
        while(n>0)
        {
           int rem=n%2;
           int  a=(int)(rem*Math.pow(10,pow));
           bin=bin+a;
           pow++;
           n=n/2;
        }
        System.out.println(bin);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter decimal number:");
        int m=sc.nextInt();
        dectobin(m);
        
    }
}
