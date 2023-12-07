public class largeststring {
    public static void main(String[] args) {
        String fruits[]={"apple","mango","banana","grapes","pears"};
        String largest=fruits[0];
        for(int i=0;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])< 0) {
                largest=fruits[i];
            }
        }
        System.out.println("largest fruit is"+ " " +largest);

    }
}
