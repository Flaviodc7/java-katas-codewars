public class Main {
    public static int zeros(int n) {
        int result = 0;
        int rest;
        rest = n / 5;
        result += rest;
        while (rest >= 5) {
            rest = rest / 5;
            result += rest;
        }
        return result;
    }

    public static void main(String[] args){
        int result = zeros(30);
        System.out.println(result);
    }
}