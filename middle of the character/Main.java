import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        int length = input.length(); 
        int mid = length / 2; 
        if (length % 2 == 0) {
            System.out.println("Middle characters: " + input.charAt(mid - 1) + input.charAt(mid));
        } else {
           
            System.out.println("Middle character: " + input.charAt(mid));
        }

    }
}