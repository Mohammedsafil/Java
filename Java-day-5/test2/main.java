package test2;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();

    if(s.length()!=1){
        System.out.println("Invalid Input!, Only Single Char is Allowed");
    }
    else{
        if(!Character.isLetter(s.charAt(0))){
            System.out.println("Invalid Input!, Only Letters are Allowed");
        }
        else{
            char ch = Character.toLowerCase(s.charAt(0));
            if(ch=='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                System.out.println("Vowel");
            }
            else{
                System.out.println("Consonant");
            }
        }
    }
    } 
}
