public class sorted_rotated_array{
    public static int minsearch(int arr[]){
        int start=0;
        int end=arr.length-1;
        
        while(start<end){
            int mid=start+(end-start)/2;
            if (arr[mid]>arr[0]) {
                start=mid+1;
            }
            else{
                end=mid;
            }
           
        

        }
        return start;
    }

public static int search(int arr[],int start,int end,int target){
    int mid= start+(end-start)/2;
    
    while(start<=end){
        if(target==arr[mid]){
            target=mid;
            return mid;
        }
        else if(target>=arr[mid]){
            start=mid+1;
            
        }
        else{
            end=mid-1;
        }
         mid=start+(end-start)/2;
    }
    return -1;
} 
public static int search(int arr[],int target){
 
    int pivot = minsearch(arr);
    if (target>=arr[pivot] && target <= arr[arr.length-1]){
        return  search( arr,pivot,arr.length-1,target);
    }
    else{
        return search(arr,0,pivot,target);
    }

}

public static void main(String[] args) {

   int arr[] = {4,5,6,7,1,2,3};
   int target=7;
   int result=search(arr,target);
   System.out.println("element found at index:"+result);

}
}

