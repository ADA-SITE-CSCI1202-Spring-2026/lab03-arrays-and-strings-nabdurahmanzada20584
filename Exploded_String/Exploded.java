package Exploded_String;

public class Exploded {

    public static String explode(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.substring(0, i + 1));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "Baku";
        System.out.println(explode(s));
    }
}
