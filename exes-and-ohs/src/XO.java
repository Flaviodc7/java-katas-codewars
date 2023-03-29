import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class XO {

    public static boolean getXO (String str) {
        Map<Character, Integer> xo_map = new HashMap<>();
        char[] chars = str.toLowerCase().toCharArray();
        for (char aChar : chars) {
            if (aChar == 'o') {
                xo_map.putIfAbsent(aChar, 0);
                xo_map.put(aChar, xo_map.get(aChar) + 1);
            } else if (aChar == 'x') {
                xo_map.putIfAbsent(aChar, 0);
                xo_map.put(aChar, xo_map.get(aChar) + 1);
            }
        }
        return Objects.equals(xo_map.get('o'), xo_map.get('x'));
    }

    public static void main(String[] args){
        Boolean result = getXO("JoXrge");
        System.out.println(result);
    }


}