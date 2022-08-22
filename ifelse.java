import java.util.Scanner;
public class ifelse{
    public static Scanner scn= new Scanner(System.in);
    public static void main(String[] args){
        int a= scn.nextInt();
        // CHECK IF IS A GREATER THAN 20
        if (a>=20){
            System.out.print("a is greater than 20 or equal of 20");

        
        }else{
            System.out.println("a is lower than 20");
        }
    
    }
}