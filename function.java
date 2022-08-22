import java.util.Scanner;
public class function{
public static Scanner scn=new Scanner(System.in);
public static void main(String[]args){
     multiply();


// System.out.print(" Enter first digit:");
// int a=scn.nextInt();
// System.out.print("Enter second number:");
// int b=scn.nextInt();
// int c=a + b;
// System.out.print("sum of "+ a + "and"+ b + "is:" + c);
// int c= sum(10,25);
// System.out.println("sum of c is:" + c);
//     }
//     public static int sum(int a, int b) {
//         int c= a + b;
//         return c ;
// ANOTHER METHOD

    }
    public static void sum(){
        System.out.print("enter the value of a and b");
        int a=scn.nextInt();
        System.out.print("enter the value of second number");
        int b=scn.nextInt();
        int c=a + b;
        System.out.println(c);

    }
    public static void multiply(){
        System.out.print(" multiple od a");
        int a=scn.nextInt();
        System.out.print("multiple of b");
        int b=scn.nextInt();
        int c= a * b;
        System.out.println(c);
        
    }
}