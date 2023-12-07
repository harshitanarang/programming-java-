public class number_countingin2d {
    public static void count(int arr[][],int key){
        int c=0;
        int row=0;
        int col=0;
        while(row<arr.length && col<arr[0].length){
            if(arr[row][col]==key){
                c++;
                col++;
                row++;
            }
        }
        System.out.println("number="+c);


    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9},{4,11,12}};
        int key=4;
        count(arr,key);
    }
}
