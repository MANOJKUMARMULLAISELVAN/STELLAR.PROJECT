import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        String str =s.next();
        String b=s.next();
        int a=s.nextInt();
        char ch=s.next().charAt(0);
        double d=s.nextDouble();
        System.out.println("name of the event : "+str);
        System.out.println("event type : "+b);
        System.out.println("expected count : "+a);
        System.out.println("y/n : "+ch);
        System.out.println("total expense : "+d);
    }
}
