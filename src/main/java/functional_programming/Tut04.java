package functional_programming;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Tut04 {
    public static void main(String [] args ){

        Map<String, Integer> map = new HashMap<>();
        map.put("H", 12);
        map.put("E", 13);
        map.put("L", 14);
        map.put("O", 15);

        BiConsumer<String, Integer> biConsumer = (key, value) -> {
            System.out.println("Key :" + key + "  Value :" + value);
        };
        map.forEach(biConsumer);

    }
}
