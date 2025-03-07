import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        int a=s.nextInt();
        float b=s.nextFloat();
        char ch=s.next().charAt(0);
        double d=s.nextDouble();
        boolean x=s.nextBoolean();
        s.nextLine();
        String str =s.next();
        System.out.println("integer value:"+a);
        System.out.println("float value:"+b);
        System.out.println("char value:"+ch);
        System.out.println("double value:"+d);
        System.out.println("boolean value:"+x);
        System.out.println("str value:"+str);
    }
}