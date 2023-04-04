import java.util.ArrayList;
import java.util.List;

public class SmileFaces {

    public static int countSmileys(List<String> arr) {
        int count = 0;
        for (String s : arr) {
            if (s.matches("[:;][-~]?[)D]")) count++;
        }
        return count;
    }

    public static void main(String[] args){
        List<String> a = new ArrayList<>();
        a.add(":)"); a.add(":D"); a.add(":-}"); a.add(":-()");
        int result = countSmileys(a);
        System.out.println(result);
    }
}