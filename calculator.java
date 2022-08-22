import java.util.Scanner;
public class calculator{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
       
        
        
        System.out.println("Enter option ");
        int option=scn.nextInt();
        System.out.println("Enter option 1:");
        int a =scn.nextInt();
        System.out.println("Enter option 2:");
        int b =scn.nextInt();

        if(option==1){
            int ans = sum(a,b);
            System.out.println(a + "+" + b +"=" + ans);

        }else if(option==2){
           int ans = subtract(a,b);
           System.out.println(a + "-" + b +"=" + ans);

        }else if(option==3){
            double ans = divide(a,b);
            System.out.println(a + "/" + b +"=" + ans);

        }else if(option==4){
            int ans = multiply(a,b);
            System.out.println(a + "*" + b +"=" + ans);

        }else{
             System.out.println("invalid ooption");

        }
    }
        // sum
        public static int sum(int a,int b){
            int c=a + b;
            return c ;
        }
        // subtract
        public static int subtract(int a,int b){
            int c=a - b;
            return c ;
        }
        // divide
        public static double divide(int a,int b){
            double c= (double) a / b;
            return c ;
        }
        // multiply
        public static int multiply(int a,int b){
            int c=a * b;
            return c ;
        }
        public static void reminder(int a,int b){
           
            return ;

    
}
}