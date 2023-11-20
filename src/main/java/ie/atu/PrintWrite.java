package ie.atu;
import java.io.IOException;
import java.io.PrintWriter;
public class PrintWrite {
    public static void main(String[] args) {
        String fileName = "File13.txt";
        try {
            PrintWriter writer = new PrintWriter(fileName);
            writer.println("I am Rick");
            writer.println("I am 20 years old");
            writer.close();
            System.out.println("Content successfully written to the file");
        }
        catch (IOException e){
            System.out.println("An error occurred while writing the file.");
        }
    }
}
