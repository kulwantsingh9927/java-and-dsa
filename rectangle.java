import java.util.Scanner;
public class rectangle{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        System.out.print("enter the value of rectangle length:");
        int a=scn.nextInt();
        System.out.print("enter the value of weith of rectangle");
        int b=scn.nextInt();
        int c=a * b ;
        System.out.println("area of rectangle is :" +c);

    }
}