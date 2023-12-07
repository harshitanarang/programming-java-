public class toh {
    public static void toh(int n,String A ,String B, String C){
        if(n>0){
            toh(n-1,A,C,B);
            System.out.println("move disk " +  n  + " from " + A + " to "  + C);
            toh(n-1,B,A,C);

        }   
     }
    public static void main(String[] args) {
        int n=4;
        toh(n,"A","B","C");
        
    }
}
