package Task2;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Double> numbers = List.of(1.1, 1.3, 1.5, 1.7, 1.9, 2.1, 2.3, 2.5, 2.7, 2.9);

        // Create a stream of integers from 1 to 10
        Stream<Double> stream = numbers.stream();

        //Finding the average of the numbers in the stream
        Double average = stream.mapToDouble(Double::doubleValue).average().getAsDouble();
        // Print the average
        System.out.println("Average: " + average);
        
    }

}
