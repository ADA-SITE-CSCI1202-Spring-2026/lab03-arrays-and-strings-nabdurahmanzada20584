package Mixed_String;
public class Mixed {

    public static String mixed(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = swap(arr[i]);
        }
        return String.join(" ", arr);
    }

    public static String swap(String s) {
        if (s.length() <= 1) {
            return s;
        }
        char[] chars = s.toCharArray();
        char temp = chars[0];
        chars[0] = chars[chars.length - 1];
        chars[chars.length - 1] = temp;
        return new String(chars);
    }


    public static void main(String[] args) {
        String s = "This is PP2 Fall 2021";
        System.out.println(mixed(s.split(" ")));
    }
}
