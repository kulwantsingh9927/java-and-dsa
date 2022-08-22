import java.util.Scanner;
public class onetotwelve{
    public static Scanner scn= new Scanner(System.in);
    public static void main(String[]args){
    //     int k=1;
    //     for(j=1;j<=4;j++){
    // for(int i=1;i<=4;i++){
    //     System.out.println( k + " ");
    //     k++;
    
    //         System.out.println("/n");
        
    // }
    // }  ANOTHER METHOD
    for(int j=0; j<=3;j++){
        for(int i=1;i<=4;i++){
            System.out.println((i + (j)*4)+" ");
        }
    }
}
}