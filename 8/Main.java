import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int tot=a+b+c;
        if(tot==180){
            if((a==90)||(b==90)||(c==90)){
                System.out.println("prize 2");
            }
            else if((a!=b)&&(b!=c)&&(a!=c)){
                System.out.println("prize 1");
            }
            else if((a==b)&&(b==c)&&(a==c)){
                System.out.println("prize 3");
            }
        }
          
        else{
            System.out.println("no triangle");
        }
       
        
    }
}

