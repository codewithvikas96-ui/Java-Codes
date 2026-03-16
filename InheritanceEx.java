/*
WAJP to implement following inheritance
     [Emp(empno, name, sal)]     [Overtime(noOfHours)]
           \                        /
            \                     /     
             \                  /
                   [Salary]
    
Calculate and display total salary in salary class. Consider overtime salary as 500 rs/hrs
*/

import java.util.Scanner;

class Employee {
    String name;
    int empno;
    double basicSalary;
    
    Employee(String name, int empno, double basicSalary){
        this.name = name;
        this.empno = empno;
        this.basicSalary = basicSalary;
    }
}

interface Overtime {
    double calculateOvertime();
}

class Salary extends Employee implements Overtime {
    double noOfHours;
    
    Salary(String name, int empno, double basicSalary, double noOfHours){
        super(name, empno, basicSalary);
        this.noOfHours = noOfHours;
    }
    
    @Override
    public double calculateOvertime(){
        return 500 * noOfHours;
    }
    
    double totalSalary(){
        return basicSalary + calculateOvertime();
    }
    
    void display(){
        System.out.println("===== Employee Details =====");
        System.out.println("Name: " + name);
        System.out.println("Emp no: " + empno);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Overtime Hours: " + noOfHours);
        System.out.println("Overtime Salary: " + calculateOvertime());
        System.out.println("Total Salary: " + totalSalary());
    }
    
}

public class InheritanceEx{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Employee name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter emp no: ");
        int empno = sc.nextInt();
        
        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();
        
        System.out.print("Enter Overtime Hours: ");
        double noOfHours = sc.nextDouble();
        
        Salary sal = new Salary(name, empno, basicSalary, noOfHours);
        sal.display();
    }
}
