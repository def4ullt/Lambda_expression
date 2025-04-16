package Task4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;


public class main {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(7);
        array.add(8);

        int sum = array.stream()
                .filter((value) -> value % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
            
        System.out.println("Sum of even numbers: " + sum);
    }
}
