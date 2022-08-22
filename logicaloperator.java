import java.util.Scanner;
public class logicaloperator{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        System.out.print("enter the mark of student one");
        int m1=scn.nextInt();
        System.out.print("enter the mark of student two");
        int m2=scn.nextInt();
        
        if(m1<50 && m2<50){
            System.out.println("both student are fail");
        }else if(m1>50 && m2<50){
            System.out.println("student m1 is pass and student m2 is fail");
        }else if(m1 < 50 && m2>50){
            System.out.println("student m1 is fail and student m2 is pass");

        }else{
            System.out.println("both student m1 and m2 are passed");
        }
    }
}