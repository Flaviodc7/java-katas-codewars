import java.util.regex.Pattern;

public class Solution {

    public static boolean validatePin(String pin) {
        if (pin.length() == 4) {
            return Pattern.matches("\\d{4}", pin);
        } else if (pin.length() == 6){
            return Pattern.matches("\\d{6}", pin);
        } else {
            return false;
        }
    }

    public static void main(String[] args){
        boolean result = validatePin("090009");
        System.out.println(result);
    }

}