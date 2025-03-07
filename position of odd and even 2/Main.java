import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int w=0,l=0;
        print(w,l,str);
    }
        public static void print(int w,int l,String str){
        for(int i=0;i<str.length()-2;i++){
            if(str.charAt(i)==(str.charAt(i+2))){
                w++;
            }
            else{
                l++;
            }
        }
        if(l==0&&str.length()%2==0){
            System.out.println("win");
        }
        else{
            System.out.println("lose");
        }
    }
}