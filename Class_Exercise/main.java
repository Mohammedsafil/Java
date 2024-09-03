import java.util.Scanner;

public class main{
    public static void main(String[] args){
        User u1 = new User("Sarathi","Coimbatore","8925796628");
        u1.userDetais();
        Scanner sc = new Scanner(System.in);
        int noofuser = sc.nextInt();

        User [] userArr = new User[noofuser];

        String name;
        String address;
        String mobile;

        for(int i=0;i<noofuser;i++){

        }

        sc.close();
    }
}

class User{
    private String name;
    private String address;
    private String mobile;


    public User(){}
    public User(String name){this.name = name;}
    public User(String name,String address){
        this.name = name;
        this.address = address;
    }
    public User(String name,String address,String mobile){
        this.name=name;
        this.address = address;
        this.mobile = mobile;
    }

    public void setName(String name){this.name = name;}
    public void setAddress(String address){this.address = address;}
    public void setMobile(String mobile){this.mobile = mobile;}



    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

    public String getMobile(){
        return this.mobile;
    }

    public void userDetais(){
        System.out.println("Name : "+this.name);
        System.out.println("Address : "+address);
        System.out.println("Mobile :"+mobile);
    }


}