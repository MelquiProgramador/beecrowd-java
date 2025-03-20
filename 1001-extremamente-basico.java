import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        input.close();
        System.out.println("X = " + (number1 + number2));
        
    }
 
}
