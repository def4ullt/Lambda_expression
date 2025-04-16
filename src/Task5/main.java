package Task5;

import java.util.Scanner;
import java.util.stream.IntStream;

public class main {
    public static void main(String[] args) {
        System.out.println("Enter number for factorial: ");
        
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        sc.close();

        IntStream stream = IntStream.rangeClosed(1, number);
        
        int factorial = stream.reduce(1, (a, b) -> a * b);

        System.out.println("Factorial of " + number + " is: " + factorial);

    }

}
