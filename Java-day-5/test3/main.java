package test3;

import java.util.Scanner;

public class main {
    /**
     * @param args
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if((n1==n2) && (n1==n3) && (n2==n3)){
            System.out.println("All three numbers are equal");
        }
        else if((n1!=n2) && (n1!=n3) && (n2!=n3)){
            System.out.println("All three numbers are different");
        }
        else{
            System.out.println("Neither all equal or diffrent");
        }
    }
}
