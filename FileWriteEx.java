// Q WAJP to write to file

import java.io.*;

public class Main {
    public static void main(String[] args){
        try(FileWriter fw = new FileWriter("sample.txt", true)){
            fw.write("Hellooooooooooooooooooooooooooooo\n");
            fw.write("The Man\n");
            fw.write("The Myth\n");
            fw.write("The Monster\n");
            fw.write("Jonathan16\n");
            
            System.out.println("File written successfully");
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        } 
    }
}
