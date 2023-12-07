public class diagnolsum {
    public static void sum(int arr[][]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i][i];
            if(i!=arr.length-i-1){
                sum+=arr[i][arr.length-1-i];
            }
        }
        System.out.println("sum is:"+sum);
    } 
    public static void main(String[] args) {
        int arr[][]={{1,2,3,7},
                     {4,5,6,8,}, 
                     {7,8,9,6},
                     {10, 11, 12,13}};
        sum(arr);
        
    }
    
}
