import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // HashMap to store sorted string as key and list of anagrams as value
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            // Convert word to char array, sort it, and get the sorted string
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            // If sorted word is not in map, create a new list
            map.putIfAbsent(sortedWord, new ArrayList<>());

            // Add the original word to the list
            map.get(sortedWord).add(word);
        }

        // Convert map values (lists of anagrams) to result format
        return new ArrayList<>(map.values());
    }
}
