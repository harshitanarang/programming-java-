import java.util.*;

public class binarytodecimal {
    public static void bintodecimal(int m){
        int pow=0;
        int decimal =0;
        int n;
        n=m;
        while(n>0){
            int ld= n%10;
            int a= (int)(ld*Math.pow(2,pow));
            pow++;
            n=n/10;
            decimal+=a; 
        }
        System.out.println(decimal);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter binary number eg: 1010 ");
        int m = sc.nextInt();
        bintodecimal(m);
        
        

        
    }
}
