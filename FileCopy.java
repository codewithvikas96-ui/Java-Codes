import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        
        try {
            // Source file
            FileInputStream fin = new FileInputStream("input.txt");
            
            // Destination file
            FileOutputStream fout = new FileOutputStream("output.txt");
            
            int ch;
            
            // Read and write byte by byte
            while((ch = fin.read()) != -1) {
                fout.write(ch);
            }
            
            System.out.println("File copied successfully!");
            
            // Close files
            fin.close();
            fout.close();
            
        } catch(IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
