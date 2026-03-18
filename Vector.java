// WAJP to demonstrate the use of vector class

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        
        // Create Vector
        Vector<Integer> v = new Vector<>();
        
        // Add elements
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        
        System.out.println("Vector elements: " + v);
        
        // Access element
        System.out.println("Element at index 2: " + v.get(2));
        
        // Remove element
        v.remove(1);
        System.out.println("After removing index 1: " + v);
        
        // Size
        System.out.println("Size of vector: " + v.size());
        
        // Iterate using loop
        System.out.println("Using loop:");
        for(int i = 0; i < v.size(); i++){
            System.out.println(v.get(i));
        }
    }
}
