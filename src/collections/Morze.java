package collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Андрей on 08.09.2017.
 */
public class Morze {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("а", ".-");
        map.put("б", "-...");
        map.put("в", ".--");
        map.put("г", "--.");
        map.put("д", "-..");
        map.put("е", ".");
        map.put("ж", "...-");
        map.put("з", "--..");
        map.put("и", "..");
        map.put("й", ".---");
        map.put("к", "-.-");
        map.put("л", ".-..");
        map.put("м", "--");
        map.put("н", "-.");
        map.put("о", "---");
        map.put("п", ".--.");
        map.put("р", ".-.");
        map.put("с", "...");
        map.put("т", "-");
        map.put("у", "..-");
        map.put("ф", "..-.");
        map.put("х", "....");
        map.put("ц", "-.-.");
        map.put("ч", "---.");
        map.put("ш", "----");
        map.put("щ", "--.-");
        map.put("ъ", ".--.-.");
        map.put("ы", "-.--");
        map.put("ь", "-..-");
        map.put("э", "..-..");
        map.put("ю", "..--");
        map.put("я", ".-.-");

        System.out.println(args[0]);
        char []arr = args[0].toCharArray();
        for (char anArr : arr) {
            System.out.print(map.get(String.valueOf(anArr)));
        }
    }

}
