import java.util.*;

public class FrequencyCounter {
    public static void main(String[] args) {
        String[] names = "programming"
;
        
        
        Map<Character, List<String>> groupedNames = new HashMap<>();

        for (String name : names) {
            char firstLetter = name.charAt(0);
            
      
            groupedNames.computeIfAbsent(firstLetter, k -> new ArrayList<>())
                        .add(name);
        }

        
        groupedNames.forEach((letter, list) -> {
            System.out.println(letter + " -> " + list);
        });
    }
}