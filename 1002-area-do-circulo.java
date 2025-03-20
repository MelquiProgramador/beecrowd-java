import java.util.Scanner;

class Main {

    public static void main(String[] args) { 
        Scanner reader = new Scanner(System.in);
        double n = 3.14159;
        double r = reader.nextDouble();
        double a = n * Math.pow(r, 2);
        System.out.printf("A=%.4f", a);
        System.out.println();
    }

}
