public class selection_function {
    public static void selection_sort(int arr[]){
        for(int i =0;i<arr.length-1;i++){
           int min_pos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min_pos]> arr[j]){
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
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        selection_sort(arr);
        
    }
}
