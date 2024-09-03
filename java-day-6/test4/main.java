package test4;
import java.util.Scanner;
public class main {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Person pr = new Person(sc.nextLine(),sc.nextInt(),sc.nextLine());
        pr.displayDetail();
    }
}


class Person{
    private String name;
    private int age;
    private String email;

    public Person(String name,int age,String emial){
        this.name=name;
        this.age=age;
        this.email=emial;
    }

    public void updateAge(int age){
        this.age = age;
    }

    public void updateEmail(String email){
        this.email = email;
    }

    public void displayDetail(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Email: "+email);
    }
}