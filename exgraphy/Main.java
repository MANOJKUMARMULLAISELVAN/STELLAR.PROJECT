import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        int stringComparison = s1.compareTo(s2);
        System.out.println("String comparison result: " + stringComparison);
        char c1 = s1.charAt(0);
        char c2 = s2.charAt(0);
        int charComparison = Character.compare(c1, c2);
        System.out.println("Character comparison result: " + charComparison);
    }
}
