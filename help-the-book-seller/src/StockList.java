import java.util.HashMap;

public class StockList {

    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOf1stLetter.length == 0 || lstOfArt.length == 0) return "";
        HashMap<String,Integer> result_map = new HashMap<>();
        for (String s : lstOf1stLetter) {
            result_map.put(s, 0);
        }
        for (String art : lstOfArt){
            for (String first : lstOf1stLetter){
                if (String.valueOf(art.charAt(0)).equals(first)){
                    int number = Integer.parseInt(art.split(" ")[1]);
                    result_map.put(first, result_map.get(first) + number);
                }
            }
        }
        return String.join(") - (", result_map.toString().replaceAll("[{]", "(").replaceAll("[}]", ")").replaceAll("=", " : ").split(", "));
    }

    public static void main(String[] args){
        String[] art = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String[] cd = new String[] {"A", "B"};
        String result = stockSummary(art, cd);
        System.out.println(result);
    }
}
