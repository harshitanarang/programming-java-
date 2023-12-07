import java.util.*;
public class selection_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++){
            System.out.println("enter element:");
           arr[i]=  sc.nextInt();
        }
         for( int i = 0;i<arr.length-1;i++){
            int min_pos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min_pos] >arr[j]){
                    min_pos=j;
                }
           }
           //swap
           int temp=arr[min_pos];
           arr[min_pos]=arr[i];
           arr[i]=temp;

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
    }
    }

