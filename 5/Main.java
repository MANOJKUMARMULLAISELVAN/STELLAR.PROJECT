import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        int a=s.nextInt();
        int b=a%10;
        if(b== 8 || b== 3){
            System.out.println("the winner");
        }
        else{
            System.out.println("they no the winner");
        }
        
    }
}