// Q WAP to read students deatils, calculate and display percentage of student

import java.util.Scanner;

class Student {
    String name;
    int id;
    int age;
    int[] marks;
    
    Student(String name, int id, int age, int marks[]){
        this.name = name;
        this.id = id;
        this.age = age;
        this.marks = marks;
    }
    
    double calculatePercentage() {
        int sum = 0;
        for(int m : marks){
            sum += m;
        }
        
        return (sum / 500.0) * 100.0;
    }
    
    void showMarks(){
        for(int m : marks){
            System.out.print(m + ", ");
        }
        System.out.println();
    }
    
    void display(){
        System.out.println("===== Students Details =====");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Age: " + age);
        System.out.print("Marks of 5 subjects: ");
        showMarks();
        System.out.println("Percentage: " + calculatePercentage() + "%");
        
    }
}

public class Details{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        
        int[] marks = new int[5];
        System.out.print("Enter marks of 5 subjects: ");
        for(int i = 0; i < 5; i++){
            marks[i] = sc.nextInt();
        }
        
        Student s = new Student(name, id, age, marks);
        s.display();
        
        sc.close();
    }
}
