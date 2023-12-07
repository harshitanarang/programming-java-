import java.util.*;
public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter year:");
        int y=sc.nextInt();
        if(y%4==0)
        {
            if(y%100!=0)
            {
                System.out.println("leap year");
            }
            else{
                
                if(y%400==0)
                {
                    System.out.println("leap year");
                }
                else{
                    System.out.println("not leap year");
                }
            }
        }
        else{
            System.out.println("not leap year");
        }
        }
}
