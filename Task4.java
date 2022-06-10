public class Task4 {
    public static void main(String[] args){
        hanoi(3, "1","2","3");
    }                                     
    public static void hanoi (int n, String first, String second, String third){
        if (n == 1) {
            System.out.println (first + " to " + third);
        }
        else {
            hanoi (n-1, first, third, second);
            System.out.println (first + " to " + third);
            hanoi (n-1, second, first, third);
        }
    } 
}