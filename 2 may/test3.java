import java.util.Scanner;
public class test3{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
         String s1 = scn.nextLine();
         String s2 =scn.nextLine();
         String ans="";
         for(int i = 0 ;i < s1.length() ; i++ ){
            ans= ans +s1.charAt(i)+ s2.charAt(i);
         }
         System.out.println(ans);
    }
}
       