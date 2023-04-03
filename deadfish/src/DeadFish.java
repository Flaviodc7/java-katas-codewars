import java.util.Arrays;

public class DeadFish {
    public static int[] parse(String data) {
        char[] arr = data.toCharArray();
        int result = 0;
        int count = data.replaceAll("[^o]", "").length();
        int [] arr_result = new int[count];
        int position = 0;
        int char_position = 0;
        do {
            if (arr[char_position] == 'i') result++;
            else if (arr[char_position] == 'd') result--;
            else if (arr[char_position] == 's') result = (int) Math.pow(result, 2);
            else if (arr[char_position] == 'o') {
                arr_result[position] = result;
                position++;
            }
            char_position++;
        } while (position < count);
        return arr_result;
    }

    public static void main(String[] args){
        int [] result = DeadFish.parse("iiisdoso");
        System.out.println(Arrays.toString(result));
    }
}
