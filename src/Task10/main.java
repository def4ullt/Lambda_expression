package Task10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;


public class main {
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();

        list.add(null);
        list.add(null);
        list.add("Lorem ipsum");
        list.add(null);
        list.add("dolor sit amet");

        String firstNotNull = list.stream()
                .filter((value) -> value != null)
                .findFirst()
                .orElse("No non-null values found");
        
        System.out.println("First non-null value: " + firstNotNull);
    }

}
