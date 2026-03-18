import mypack.Calculator;

public class Arithmetic {
    public static void main(String[] args) {
        
        Calculator obj = new Calculator();
        
        int a = 10, b = 5;
        
        System.out.println("Addition: " + obj.add(a, b));
        System.out.println("Subtraction: " + obj.sub(a, b));
        System.out.println("Multiplication: " + obj.mul(a, b));
        System.out.println("Division: " + obj.div(a, b));
    }
}
