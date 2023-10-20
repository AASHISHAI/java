/*• Define class Employee that has the following members.
– String name, double salary as private instance variables 
– Constructor to initialize the instance variables 
– Define method print() to display name and salary of an Employee 
– Overload method print() as print(float percent) to display the name, 
salary and bonus of an Employee 
– Method public double bonus(float percent) that returns the bonus 
computed as (percent/100.0)*salary
• Define class Manager that extends class Employee and has the 
following members.
– String secretary as private instance variable 
– Define a constructor to initialize the instance variables of Manager 
that includes the instance variables of Employee 
– Override method print() to display the name, salary and secretary of 
Manager.
– Override method print(float percent) to display the name, salary, 
secretary and bonus of a Manager
– Override public double bonus(float percent) that returns the bonus 
of a Manager as 50 percent extra bonus than a regular employee 
• Define class InheritanceTest that has the main method. 
– Here, take two reference variables obj1 and obj2 of an Employee. 
– Initialize obj1 with Employee class object. 
– Initialize obj2 with Manager class object. 
– call print() and print(float percent) methods using both obj1 and 
obj2*/
class Employee20 {
    private String name;
    private double salary;
    public Employee20(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    void print() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
    void print(float percent) {
        double bonus = bonus(percent);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
    }
    public double bonus(float percent) {
        return (percent / 100.0) * salary;
    }
}
class Manager extends Employee20 {
    private String secretary;
    public Manager(String name, double salary, String secretary) {
        super(name, salary);
        this.secretary = secretary;
    }
    void print() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Secretary: " + secretary);
    }
    void print(float percent) {
        double bonus = bonus(percent);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Secretary: " + secretary);
        System.out.println("Bonus: " + bonus);
    }
    public double bonus(float percent) {
        return (percent / 100.0) * salary + 0.5 * bonus(percent);
    }
}
public class InheritanceTest {
    public static void main(String[] args) {
        Employee20 obj1 = new Employee20("Dev", 10000);
        Manager obj2 = new Manager("Dev", 15000, "Sumu");
        obj1.print();
    }
}