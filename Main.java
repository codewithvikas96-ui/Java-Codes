# WAP to read employee details, calculate and display total salary of employee by adding HRA,DA,TAX


import java.util.Scanner;

class Employee {
    String name;
    int id;
    double basicSalary;
    
    Employee(String name, int id, double basicSalary){
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
    }
    
}

class Salary extends Employee{
    double grossSalary;
    double hra,da,tax;
    
    Salary(String name, int id, double basicSalary, double hra, double da, double tax){
        super(name,id,basicSalary);
        this.hra = (hra / 100) * basicSalary;
        this.da = (da / 100) * basicSalary;
        this.tax = tax;
    }
    
    double calculateSalary(){
        return basicSalary + hra + da - tax;
    }
    
    void display(){
        System.out.println("===== Employee Details ===== ");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("TAX: " + tax);
        System.out.println("Gross Salary: " + calculateSalary());
    }
}

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Enter name: ");
	    String name = sc.nextLine();
	    
	    System.out.print("Enter ID: ");
	    int id = sc.nextInt();
	    
	    System.out.print("Enter Basic Salary: ");
	    double basicSalary = sc.nextDouble();
	    
	    System.out.print("Enter HRA%: ");
	    double hra = sc.nextDouble();
	    
	    System.out.print("Enter DA%: ");
	    double da = sc.nextDouble();
	    
	    System.out.print("Enter TAX: ");
	    double tax = sc.nextDouble();
	    

		Salary sal = new Salary(name, id, basicSalary, hra, da, tax);
		sal.display();
	}
}

