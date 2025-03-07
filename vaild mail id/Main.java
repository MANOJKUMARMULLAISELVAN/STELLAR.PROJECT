import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String email = s.nextLine();
        System.out.println(email);
        if(email.contains(".com")||email.contains("123")||email.contains("@")||email.contains("$")){
            System.out.println("valid email address");
        }else{
            System.out.println("invalid email address");
        }
    }
}