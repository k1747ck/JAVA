
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int [] squares = new int[n];

        for (int i=0; i<n; i++) {
            squares[i]= (i+1)*(i+1);

            System.out.println("Square from 1 to " +n+ ":");
            for (int square : squares){
                System.out.println(square+" ");
            }
            
        }
    }
}