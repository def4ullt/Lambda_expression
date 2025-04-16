package Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
    List<String> words = new ArrayList();
    
    words.add("Banana");
    words.add("Apple");
    words.add("Orange");
    words.add("Grapes");
    
    System.out.println("Original words: " + words);

    Collections.sort(words, (String a, String b) -> {
    return a.compareTo(b);
    });
    System.out.println("Sorted words: " + words);
}
}


    
