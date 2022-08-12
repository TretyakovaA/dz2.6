import com.sun.source.doctree.SeeTree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s1 = "машина велосипед грузовик машина";
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList<>(Arrays.asList(s1.split(" ")));
        oddNumbers(nums);
        evenNumbers(nums);
        uniqueWord(words);
        quantityWord(s1);
    }

    private static void oddNumbers(List<Integer> nums) {
        List<Integer> oddNumbers = new ArrayList<>(List.of());

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                oddNumbers.add(nums.get(i));

            }
        }
        System.out.println(oddNumbers.toString());
    }

    private static void evenNumbers(List<Integer> nums) {
        Set<Integer> evenNumbers = new TreeSet<>(Arrays.asList());
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                evenNumbers.add(nums.get(i));
            }

        }
        System.out.println(evenNumbers.toString());
    }

    private static void uniqueWord(List<String> words) {
        Set<String> uniqueWord = new HashSet<>(Arrays.asList());
        for (String word : words) {
            if (Collections.frequency(words, word) == 1) ;
            uniqueWord.add(word);
        }
        System.out.println(uniqueWord.toString());
    }


    public static void quantityWord(String sentence) {
        List<String> wordList = new ArrayList<>(Arrays.asList(sentence.split(" ")));
        Set<String> uniqueWords = new HashSet<>(wordList);
        List<Integer> uniqueNumbers = new ArrayList<>(List.of());
        for (String word : uniqueWords) {
            if (Collections.frequency(wordList, word) > 1) {
                uniqueNumbers.add(Collections.frequency(wordList, word));
            }

        }
        System.out.println(uniqueNumbers);
    }
}