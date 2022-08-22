import java.util.Scanner;
public class typecasting{
    public static Scanner scn= new Scanner(System.in);
    public static void main(String[] args){
        // int a=5;
        // int b=8;
        // long c= a +b;
     long a=5;// forcefully convert into int
        int b=(int ) a ;
        long c= a +b;
        System.out.println(c);
        long d= a * b;
        System.out.println(d);
    }
}