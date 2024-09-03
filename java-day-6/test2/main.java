package test2;

public class main {
    public static void main(String[] args){
        BankAccount bc = new BankAccount(202237447, "Kishore");
        bc.deposit(1000000);
        bc.withdraw(500000);
        bc.accountDetails();
    }
}

class BankAccount{
    private int accNum;
    private double balance;
    private String name;

    public BankAccount(int accNum,String name){
        this.accNum = accNum;
        this.balance = 0;
        this.name = name;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Amount Deposited Successfully");
    }

    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("Insufficient Balance");
        }
        else{
            balance -= amount;
            System.out.println("Amount Withdrawn Successfully");
            System.out.println("Account balance: "+balance);
        }
    }

    public void accountDetails(){
        System.out.println("Account Number: "+accNum);
        System.out.println("Account Holder's Name: "+name);
        System.out.println("Current Balance: "+balance);
    }
}
