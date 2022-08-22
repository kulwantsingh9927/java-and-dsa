import java.util.Scanner;
public class reducetillzero{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        // taking input
        int N=scn.nextInt();
        int step=0;
        // for(initilizin;condition;increment)
        for( ; N !=0 ; ){
            if(N % 2==0){// n is even
                N = (N/2);
            }else{
              N = N-1; // n is odd
             }
             step++;
        }
        System.out.println(step);
    }
    
}