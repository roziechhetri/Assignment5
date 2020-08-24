public class Task2 {

    public static void main(String[] args)
    {
        String str = "     Rozie     is    Java    Developer       ";

        // Call the replaceAll() method
        str = str.replaceAll("\\s", "");

        System.out.println(str);
    }
}
