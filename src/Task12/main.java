package Task12;

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

        Stream secondMax = numbers.stream()
                .sorted((a, b) -> b - a)
                .distinct()
                .skip(1)
                .limit(1);
        System.out.println("Second max: " + secondMax.findFirst().get());
    }
}
