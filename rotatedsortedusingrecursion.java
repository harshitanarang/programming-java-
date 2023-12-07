public class rotatedsortedusingrecursion {

    public static int search(int arr[],int si, int ei,int target){
        int mid=si+(ei-si)/2;
        if(si>ei){
            return -1;
        }
        else if(target==arr[mid]){
            return mid;
        }
        else if( arr[mid]>arr[si]){
            if(arr[si]<= target && target<=arr[mid]){
                return search(arr,si,mid-1,target);
            }
            else{
                return search(arr,mid+1,ei,target);
            }

        }
        else{
            if(arr[mid]<target && target<arr[ei]){

                return search(arr,mid+1,ei,target);
            } 
            else  {
                return search(arr,si,mid-1,target);
            } 
        }    
    }
    public static void main(String[] args) {
       int arr[]={ 4,5,6,7,0,1,2};
       int target=10;
       int ei=arr.length-1;
       int targtindx=search(arr,0,ei,target);
       System.out.println(targtindx);
        
    }
}
