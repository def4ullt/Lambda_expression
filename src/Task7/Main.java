package Task7;

import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Stream<Integer> stream = list.stream();

        Stream<Integer> squaredStream = stream.map((value) -> value * value);
        // Print squared values
        squaredStream.forEach(System.out::println);


    }

}
