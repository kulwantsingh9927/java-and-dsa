import java.util.Scanner;
public class report{
    public static Scanner scn= new Scanner(System.in);
    public static void main(String[] args){
        int mark = scn.nextInt();
        if(mark > 90){
            System.out.println("the grade is A");
        }  else if (mark > 70){
System.out.println("the grade is B");
        }else if (mark > 60){
            System.out.println("the grade is C");
            
        } else if (mark > 40){
            System.out.println("the grade is D");
        } else if (mark > 30){
            System.out.println("the grade is E");
        } else {
            System.out.println("the madarchode person is fail bhosdi bale padai kar leta ");
        }
    }
}