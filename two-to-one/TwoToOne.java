import java.util.Arrays;

public class TwoToOne {

    public static String longest (String s1, String s2) {
        char[] charArray = (s1 + s2).toCharArray();
        Arrays.sort(charArray);
        int len = charArray.length;
        StringBuilder result = new StringBuilder("" + charArray[0]);
        for (int i = 1; i < len; i++){
            if (charArray[i - 1] != charArray[i]){
                result.append(charArray[i]);
            }
        }
        return new String(result);
    }

    public static void main(String[] args){
        String test = longest("aretheyhere", "yestheyarehere");
        System.out.println(test);
    }


}