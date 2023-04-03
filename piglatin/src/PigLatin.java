public class PigLatin {
    public static String pigIt(String str) {
        StringBuilder arr_string = new StringBuilder();
        for (String s : str.split(" ")) {
            if (s.toLowerCase().matches("\\w+")) {
                char last = s.charAt(0);
                s = s.substring(1) + last + "ay ";
            }
            arr_string.append(s);
        }
        return arr_string.toString().trim();
    }

    public static void main(String[] args){
        String result = pigIt("O tempora o mores !");
        System.out.println(result);
    }
}