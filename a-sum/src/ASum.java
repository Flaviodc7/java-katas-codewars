public class ASum {

    public static long findNb(long m) {
        long result = 0;
        long evaluate_number;
        do {
            result++;
            evaluate_number = ((long) Math.pow(result, 2) * (long) Math.pow(result + 1, 2)) / 4;
        } while (evaluate_number < m);
        if (evaluate_number == m){
            return result;
        } else {
            return -1;
        }
    }

    public static void main(String[] args){
        long result = findNb(1775537264590751376L);
        System.out.println(result);
    }
}