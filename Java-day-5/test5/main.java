package test5;
import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements a,b,c:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int d = b*b - 4*a*c;

        if(d>1){
            double root1 = (-b+Math.sqrt(d))/(2*a); 
            double root2 = (-b-Math.sqrt(d))/(2*a);
            System.out.println("The roots are real and distinct");
            System.out.println("Root1 = "+root1);
            System.out.println("Root2 = "+root2);
        }
        else if(d==0){
            double root = -b/(2*a);
            System.out.println("The roots are real and equal");
            System.out.println("Root = "+root);
        }
        else{
            System.out.println("The roots are imaginary");
        }
    }
}
