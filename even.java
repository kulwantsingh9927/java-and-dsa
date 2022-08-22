import java.util.Scanner;
public class even{
    public static Scanner scn= new Scanner(System.in);
    public static void main(String[] args){
        int a= scn.nextInt();
        int rem=(a % 2);
        if(rem==0){
            System.out.println("even number");

        }else{
            System.out.println("odd number");
        }
    }
}