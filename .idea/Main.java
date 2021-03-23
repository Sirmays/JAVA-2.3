import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Task 1

        String[] words = new String[]{"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
                "One", "Two", "Three", "Four"};


        showUnique(words);

        countElements(words);

        //Task 2

        Phonebook phonebook = new Phonebook();


        phonebook.add("Ivanov", 12545789);
        phonebook.add("Ivanov", 49578454);
        phonebook.add("Petrov", 92696328);
        phonebook.add("Sidorov", 2222222, 222222222);

        phonebook.get("Sidorov");

    }

    public static void showUnique(String[] words) {
        HashSet<String> hashwords = new HashSet<>(Arrays.asList(words));
        System.out.println(hashwords);
    }

    public static void countElements(String[] words) {
        Map<String, Integer> result = new HashMap<>();
        for (String i : words) {
            if (result.containsKey(i)) {
                result.put(i, result.get(i) + 1);
            } else {
                result.put(i, 1);
            }
        }
        System.out.println(result);
    }
}
