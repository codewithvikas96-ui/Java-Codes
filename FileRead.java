// Q WAJP to read file content and display on cmd

import java.io.*;

public class FileRead {
    
    public static void main(String[] args){
        try (FileReader fr = new FileReader("data.txt")){
            int data;
            while((data = fr.read()) != -1){
                System.out.print((char) data);
            }
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        } 
        
    }
}
