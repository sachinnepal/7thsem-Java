
class Employee {
    String name;
    double salary;

    Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }

    void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
}

class Manager extends Employee{
    String department;

    Manager(String name,double salary,String department){
        super(name,salary);
        this.department=department;
    }

    void displayDetails(){
        super.displayDetails();
        System.out.println("Department: "+department);
    }
}

public class Q3_EmployeeManager{
    public static void main(String[] args){
        Manager m = new Manager("Sachin",50000,"IT");
        m.displayDetails();
    }
}
