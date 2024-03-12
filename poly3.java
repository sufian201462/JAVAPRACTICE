abstract class Employee{
    double salary;
    abstract void displayInfo();
    abstract void increment();
}
class Manager extends Employee{
    Manager(double salary){
        this.salary = salary;
    }
    void displayInfo(){
        System.out.println("manager's salary is: " + this.salary);
    }
    void increment(){
        this.salary += (0.15 * this.salary); 
        System.out.println("After Incremnt manager's salary is: " + this.salary);
    }
}
class Developer extends Employee{
    Developer(double salary){
        this.salary = salary;
    }
    void displayInfo(){
        System.out.println("\nDeveloper's salary is: " + this.salary);
    }
    void increment(){
        this.salary += (0.1 * this.salary); 
        System.out.println("After increment Developer's salary is: " + this.salary);
    }
}

public class poly3 {
    public static void main(String[] args){
        Manager m = new Manager(50000);
        m.displayInfo();
        m.increment();
    

        Developer d = new Developer(30000);
        d.displayInfo();
        d.increment();
    }
}
