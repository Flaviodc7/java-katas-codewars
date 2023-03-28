import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EnoughIsEnough {

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        Map<Integer, Integer> number_map = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int element : elements) {
            number_map.putIfAbsent(element, 0);
            if (number_map.get(element) < maxOccurrences) {
                number_map.put(element, number_map.get(element) + 1);
                arr.add(element);
            }
        }
        return arr.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args){
        int[] result = EnoughIsEnough.deleteNth( new int[] { 20, 37, 20, 21 }, 1 );
        System.out.println(Arrays.toString(result));
    }


}