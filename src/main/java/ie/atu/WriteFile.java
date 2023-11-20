package ie.atu;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
public class WriteFile {
    public static void main(String[] args) {
        String fileName="File13.txt";
        try{
            FileWriter addText=new FileWriter(fileName,true);
            addText.write("Hello world");
            addText.close();
            System.out.println("Content successfully written to the file");
            PrintWriter addText1=new PrintWriter(fileName);
            addText1.write("I am Rick");
            addText.close();
            System.out.println("Content successfully written to the file");
        }
        catch(IOException e){
            System.out.println("An error occurred while writing the file.");
            e.printStackTrace();
        }
    }
}
