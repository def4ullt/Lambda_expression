package Task1;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // Create a stream of integers from 1 to 10
        Stream<Integer> stream = numbers.stream();;
        
        // Filter even numbers
        Stream<Integer> evenFilterValue = stream.filter((value) -> value % 2 == 0);
        // Print even numbers  
        evenFilterValue.forEach(System.out::println);
    }
}
