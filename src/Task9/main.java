package Task9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;


public class main {
    public static void main(String[] args) 
    {
        List<String> list = new ArrayList<>();
        
        list.add("Lorem ipsum");
        list.add("dolor sit amet");
        list.add("consectetur adipiscing elit");
        list.add("sed do eiusmod tempor incididunt ut labore et dolore magna aliqua");

        Stream<String> stream = list.stream();
        
       long count = stream.flatMap((value) -> {
          String[] split = value.split(" ");
          return (Stream<String>) Arrays.asList(split).stream();
        }) .count();

        System.out.println("Total number of words: " + count);
    }
}
