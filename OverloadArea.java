// Q WAP to overload area() to calculate area of rectangle, circle, triangle

class Calculate{
    
    int area(int length, int breadth){
        return length * breadth;
    }
    
    double area(double radius){
        return Math.PI * radius * radius;
    }
    
    double area(double base, double height){
        return 0.5 * base * height;
    }
}

public class OverloadArea
{
	public static void main(String[] args) {
	    
	    Calculate obj = new Calculate();
	    
		System.out.println("Area of rectangle: " + obj.area(4, 5));
		System.out.println("Area of circle: " + obj.area(3.42));
		System.out.println("Area of triangle: " + obj.area(4.23, 7.3));
	}
}
