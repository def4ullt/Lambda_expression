package Task8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList();

        list.add("one");
        list.add("three");
        list.add("behavior");
        list.add("on");
        list.add("smile");

        Collections.sort(list, (String a, String b) -> {
            return Integer.compare(a.length(), b.length());
        });

        System.out.println("Sorted list: " + list);
    }
    
}
