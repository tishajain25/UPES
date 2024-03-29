/* Code to design a class employee of an organization. An employee has a name, empid, 
and salary. Write the default constructor, a constructor with parameters (name, empid, 
and salary) and methods to return name and salary. Also write a method increaseSalary 
that raises the employee’s salary by a certain user specified percentage. Derive a subclass 
Manager from employee. Add an instance variable named department to the manager class. Supply 
a test program that uses theses classes and methods.   */

import java.util.*;

class Employee 
{
    String name;
    int empid;
    double salary;

    Employee() {
    }

    Employee(String n, int id, double s) 
    {
        name = n;
        empid = id;
        salary = s;
    }

    String name1() 
    {
        return name;
    }

    double salary1() 
    {
        return salary;
    }

    double increaseSalary(double p) 
    {
        double s;
        double increase;
        increase = salary * (p / 100);
        s = salary + increase;
        return s;
    }
}

class Manager extends Employee 
{
    public String department = "Finance";
}

public class Employee1 
{
    public static void main(String[] args) 
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter name, emp_id and salary of the employee: ");
        String name = Sc.nextLine();
        int empid = Sc.nextInt();
        double salary = Sc.nextDouble();
        System.out.println("Enter the increased percentage in Salary:  ");
        double p = Sc.nextDouble();
        Employee obj = new Employee(name, empid, salary);
        System.out.println("Name of employee: " + obj.name1());
        System.out.println("Salary of employee: " + obj.salary1());
        System.out.println("Increased salary of employee: " + obj.increaseSalary(p));
    }
}
