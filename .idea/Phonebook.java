import java.util.*;

public class Phonebook {
    Map<String, List<Integer>> map;


    public Phonebook() {
        map = new HashMap<>();
    }

    public void add(String name, Integer number) {
        map.merge(name, new ArrayList<>(Collections.singletonList(number)), (oldV, newV) -> {
            oldV.addAll(newV);
            return oldV;
        });
    }

    public void add(String name, Integer... numbers) {
        map.merge(name, new ArrayList<>(Arrays.asList(numbers)), (oldV, newV) -> {
            oldV.addAll(newV);
            return oldV;
        });
    }

    public void get(String name) {
        System.out.println(map.get(name));
    }


    @Override
    public String toString() {
        return "Phonebook{" +
                "map=" + map +
                '}';
    }
}
