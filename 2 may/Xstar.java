import java.util.Scanner;
public class Xstar{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        int spac1=0;
        int spac2=n-2;
        int nn=1;
       
        while(nn<=(n/2)){
            printspace(spac1);
            System.out.print("*");
            printspace(spac2);
            System.out.print("*");
            nn++;
            spac1 +=1;
            spac2 -=2;
            System.out.println();
        }
        printspace((n/2));
        System.out.print("*");
        System.out.println();
        spac1=((n/2)-1);
        spac2=1;
        nn=1;
        while(nn<=(n/2)){
            printspace(spac1);
            System.out.print("*");
            printspace(spac2);
            System.out.print("*");
            nn++;
            spac1 -=1;
            spac2 +=2;
            System.out.println();
        }
    }
        public static void printspace(int n){
            for(int i=0;i<n;i++){
                System.out.print(" ");
            }
        }
    }
