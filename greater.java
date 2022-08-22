import java.util.Scanner;
public class greater{
    public static Scanner scn= new Scanner(System.in);
    public static void main(String[]args){
    int a=scn.nextInt();
    int b=scn.nextInt();
    if(a > b){
        System.out.println("the value of a is greater than value of B");
    }else{
        System.out.println("the value is B greater than A");
    }
}

}