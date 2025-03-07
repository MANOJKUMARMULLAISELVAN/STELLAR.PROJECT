import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String input = s.nextLine();
        int vowelCount = 0;
        for (char ch : input.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);
    }
}