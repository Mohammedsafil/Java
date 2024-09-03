package test1;


public class main {
    public static void main(String []args){
        Employee e = new Employee("Kishore","CSE", 92);
        e.display();
    }
}

class Employee{
    private String empName;
    private String empDept;
    private int empID;

    public Employee(String empName, String empDept, int empID){
        this.empName = empName;
        this.empDept = empDept;
        this.empID = empID;
    }

    void display(){
        System.out.println("Employee Name: "+empName);
        System.out.println("Employee Department: "+empDept);
        System.out.println("Employee ID : "+ empID);
    }
}

