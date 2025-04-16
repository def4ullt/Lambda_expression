package Task6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);

        Integer sum = numbers.stream()
                .filter((value) -> value % 2 == 0)
                .reduce(0, (a, b) -> a + b);
        
        Integer multiply = numbers.stream()
                .filter((value) -> value % 2 == 0)
                .reduce(1, (a, b) -> a * b);

        System.out.println("Sum = " + sum);
        System.out.println("Multiply = " + multiply);

    }

}
