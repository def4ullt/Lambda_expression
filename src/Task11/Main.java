package Task11;

import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<String> text1 = List.of("apple", "Banana", "Cherry", "date", "elderberry");
        List<String> text2 = List.of("Fig", "Grape", "Honeydew", "Kiwi", "Lemon");

        Stream<String> stream1 = text1.stream();
        Stream<String> stream2 = text2.stream();

        boolean allStartsUpperCase1 = stream1.allMatch(s -> Character.isUpperCase(s.charAt(0)));
        System.out.println("All elements in text1 are uppercase: " + allStartsUpperCase1);
        
        boolean allStartsUpperCase2 = stream2.allMatch(s -> Character.isUpperCase(s.charAt(0)));
        System.out.println("All elements in text2 are uppercase: " + allStartsUpperCase2);


    }

}
