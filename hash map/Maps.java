import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args0){
        Map<String, Integer> numbers = new HashMap<>();

        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        numbers.put("four", 4);
        numbers.put("five",5);

        numbers.putIfAbsent("one", 10);
        numbers.put("two", 20);
        numbers.replace("four", 5,4);
        numbers.replace("three",2,4);

        numbers.remove("five");
        numbers.remove("four", 6);
        

        System.out.println(numbers.get("two"));
        //System.out.println(numbers);
        System.out.println(numbers.keySet());
        System.out.println(numbers.values());
        System.out.println(numbers.entrySet());
    }
}
