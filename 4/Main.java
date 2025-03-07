import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        double d=s.nextDouble();
        double sa=s.nextDouble();
        double a=sa-d;
        System.out.println("enter begining odometer "+d);
        System.out.println("enter ending odometer "+sa);
        System.out.println("you travelled "+a);
        double t=25*a;
        System.out.println("you cost : "+t);
    }
}
