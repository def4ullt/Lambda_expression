package Task13;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 15; i++) {
            numbers.add(i);
        }

        Stream<Integer> stream = numbers.stream();

        Stream<Integer> evenFilterValue = stream.filter((value) -> value % 2 == 0);

        Optional<Integer> maxOptional = evenFilterValue.max(Integer::compareTo);
        if (maxOptional.isPresent()) {
            System.out.println("Maximum even number: " + maxOptional.get());
        } else {
            System.out.println("No even numbers found.");
        }
    }

}
