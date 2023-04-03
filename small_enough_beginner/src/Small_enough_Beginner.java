public class Small_enough_Beginner
{
    public static boolean smallEnough(int[] a, int limit){
        for (int j : a) {
            if (j > limit) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        boolean result = smallEnough(new int[] { 78, 117, 110, 99, 104, 117, 107, 115 }, 100);
        System.out.println(result);
    }
}