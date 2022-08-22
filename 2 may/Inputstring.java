import java.util.Scanner;
public class Inputstring{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
         String s1 = scn.nextLine();
         String s2 =scn.nextLine();
         for(int i = 0 ;i < s1.length() ; i++ ){
            System.out.print(s1.charAt(i));
            System.out.print(s2.charAt(i));
         }
    }
}
       