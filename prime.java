import java.util.*;
public class prime {
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
     boolean isprime = true;
    System.out.println("enter the number:");
    int n = sc.nextInt();
    if(n==2)
    {
        System.out.println("even prime");
    }
    else{
        for(int i=2; i<Math.sqrt(n); i++)
        {
            if(n%i==0)
            {
                isprime=false;
            }
        }
        if(isprime==true)
        {
            System.out.println("prime number");
        }
        else{
            System.out.println("not prime");
        }
    }

}
}

