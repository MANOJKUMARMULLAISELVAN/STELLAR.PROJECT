import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        int a=s.nextInt();
        if(a>90){
            System.out.println("o grade");
        }
        else if(a>=80){
            System.out.println("a grade");
        }
        else if(a>=70){
            System.out.println("b grade");
        }
        else if(a>=50){
            System.out.println("c grade");
        }
        else{
            System.out.println("e grade");
        }
        
    }
}