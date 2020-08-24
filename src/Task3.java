public class Task3 {
    public static void main(String[] args) {
        String s = "brave";
        System.out.println(s + " is integer: " + isInteger(s));
        s = "1234";
        System.out.println(s + " is integer: " + isInteger(s));
        s = "val123";
        System.out.println(s + " is integer: " + isInteger(s));
    }

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
