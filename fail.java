import java.util.Scanner;
public class fail{
    public static Scanner scn=new Scanner(System.in);
    public static void main (String[]args){
        System.out.println("Enter mark1");
        int m1=scn.nextInt();
        System.out.println("Enter mark2");
        int m2=scn.nextInt();
        System.out.println("Enter mark3");
        int m3=scn.nextInt();
        if(m1<50||m2<50||m3<50){
            System.out.println("fail");
        } else{
            System.out.println("pass");
        }

    }
}