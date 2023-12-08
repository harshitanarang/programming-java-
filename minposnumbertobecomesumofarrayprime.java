public class minposnumbertobecomesumofarrayprime {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,12};
         int r =minNumber(arr,5);
         System.out.println(r);
        
    }
    

//User function Template for Java

    public static int minNumber(int arr[], int N)
    {
        int sum=0;
        int count=0;
        for(int i=0;i<N;i++){
            sum+=arr[i];
            count=sum;
            }
        if(prime(sum)==true){
            return 0;
        }
        else{
            while (true){
                sum++;
                if(prime(sum)){
                    return sum-count;
                }
            }
            
        }
         

    }
    public static boolean prime(int sum){
        if(sum==2)
        {
            return true;
        }
        for(int i=2;i<=Math.sqrt(sum);i++)

        {
            if(sum%i==0)
            {
                return false;
            }
        }
        return true;
    }
}

