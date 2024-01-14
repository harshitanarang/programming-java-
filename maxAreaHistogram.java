import java.util.*;
public class maxAreaHistogram {
    public static void maxArea(int[] arr){
        int nsl[]=new int[arr.length];
        int nsr[]=new int[arr.length];
        Stack<Integer> s= new Stack<>();
         int maxarea=0;

        //nsr
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[i]<=arr[s.peek()]){
                s.pop();

            }
            if(s.isEmpty()){
                nsr[i]=arr.length;
            }
            else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }

        //nsl
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[i]<=arr[s.peek()]){
                s.pop();

            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }
            else{
                nsl[i]=arr[s.peek()];
            }
            s.push(i);
        }
        //max area calculation
        for(int i=0;i<arr.length;i++){
            int width=nsr[i]-nsl[i]-1;
            int currarea= arr[i]*width;
            maxarea=Math.max(currarea, maxarea);
        }
        System.out.println("max area in histogram =  "+ maxarea);

        

    }

    public static void main(String[] args) {
        int arr[]= {2,1,5,6,2,3};
        maxArea(arr);
        
    }
    
}
