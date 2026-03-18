// WAP to create package, define a class that performs arithmetic operaions. import the package and display result
// Package Structure
// project/
// │
// ├── mypack/
// │      └── Calculator.java
// │
// └── Main.java

package mypack;

public class Calculator {
    
    public int add(int a, int b){
        return a + b;
    }
    
    public int sub(int a, int b){
        return a - b;
    }
    
    public int mul(int a, int b){
        return a * b;
    }
    
    public int div(int a, int b){
        if(b != 0)
            return a / b;
        else
            return 0;
    }
}
