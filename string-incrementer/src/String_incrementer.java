import java.math.BigInteger;

public class String_incrementer {
    public static String incrementString(String str) {
        String result;
        if (str.length() == 0) return "1";
        else if (Character.isDigit(str.charAt(str.length() - 1))){
            StringBuilder int_part = new StringBuilder();
            int i = 1;
            boolean loop = true;
            do {
                char c = str.charAt(str.length() - i);
                if (Character.isDigit(c)){
                    int_part.insert(0, c);
                } else loop = false;
                i++;
            } while (loop && i <= str.length());
            BigInteger integer = new BigInteger(int_part.toString()).add(BigInteger.valueOf(1));
            String format = String.format("%0" + int_part.length() + "d", integer);
            if (str.length() != int_part.length()){
                StringBuilder text = new StringBuilder();
                int text_length = str.length() - int_part.length();
                for (i = 0; i < text_length; i++){
                    text.append(str.charAt(i));
                }
                result = text + format;
            } else {
                result = format;
            }
        } else {
            result = str + 1;
        }
        return result;
    }

    public static void main(String[] args){
        String result = incrementString("");
        System.out.println(result);
    }
}