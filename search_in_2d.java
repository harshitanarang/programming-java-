public class search_in_2d {
    public static void staircase_search(int arr[][],int key){       
        int row=0;
        int col=arr[0].length-1;
        while(row<arr.length && col>=0){
            if(arr[row][col]==key) {
                System.out.println("key found at index("+row+","+col+")");
                return;
            }
            else if(key<arr[row][col]){
                col--;
            }
            else {
                row++;

            }
        }
        System.out.println("key not found");

    }
    public static void main(String[] args) {
       int arr[][]={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
       int  key=76;
        staircase_search(arr,key);
    }
}
