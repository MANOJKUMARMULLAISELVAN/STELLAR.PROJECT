import java.util.Scanner;
class Main
{
public static void main(String args[])
{
int z, y, temp;
Scanner sct = new Scanner(System.in);   
z = sct.nextInt();  
y = sct.nextInt();
System.out.println("Before Swapping\nz = "+z+"\ny = "+y);
temp = z;   
z = y;
y = temp;
System.out.println("After Swapping\nz = "+z+"\ny = "+y);
}
}