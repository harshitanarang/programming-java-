import java.util.*;
public class primesinrange {
    public static boolean prime(int n)
    {
        if(n==2)
        {
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++)

        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }

    public static void primes_inrange(int n)
    {
        for(int i=2;i<=n;i++)
        {

            if(prime(i)==true)
        {
            System.out.print(+i+" ");
        }
        }
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range:");
         int n =sc.nextInt();
        primes_inrange(n);
        
    }
}
