import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        if ((str.charAt(0))==(str.charAt(2))){
            System.out.println("YES");
        }else{
            System.out.println("No");
        }
    }
}