import java.util.Scanner;
public class biodata{
    public static Scanner scn=new Scanner(System.in);
    public static void main (String[]args) {
        System.out.println("enter name:");
        String name=scn.nextLine();
        System.out.println("enter age:");
        String age=scn.nextLine();
        System.out.println("enter date of birth:");
        String  DOB =scn.nextLine();
        System.out.println("enter qualification:");
        String degree=scn.nextLine();
        System.out.println("Enter address:");
        String address=scn.nextLine();
        System.out.println("enter contact no.:");
        String contact=scn.nextLine();
        System.out.println("enter email address:");
        String email=scn.nextLine();

        System.out.println("name \t:\t" + name);
        System.out.println("age \t:\t" + age);
        System.out.println("dob \t:\t" + DOB);
        System.out.println("qualification \t:\t" + degree);
        System.out.println("address \t:\t" + address);
        System.out.println("contact no. \t:\t" + contact);
        System.out.println("email \t:\t" + email);

    }

}