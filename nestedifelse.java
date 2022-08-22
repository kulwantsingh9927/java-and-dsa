import java.util.Scanner;
public class nestedifelse{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        System.out.println("enter mark m1 student");
        int m1 = scn.nextInt();// mark of first student
        System.out.println("enter mark m2 student");
        int m2 = scn.nextInt();// mark of second student
        if(m1 < 50) {// m1= fail
            if(m2 < 50) {// m2=fail
                System.out.println("both are fail ");
            }else{
                System.out.println("student 1 is fail");
            }
        }else{
            if(m2 < 50) {// m2 are fail
                System.out.println("student 2 fail");

            }else{//m2 are pass
                System.out.println("both are pass");

            }
        }
    }
}