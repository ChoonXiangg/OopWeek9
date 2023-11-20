package ie.atu;
import java.io.IOException;
import java.io.FileWriter;
public class WriteFile {
    public static void main(String[] args) {
        String fileName="File13.txt";
        try{
            FileWriter addText=new FileWriter(fileName,true);
            addText.write("Hello world\n");
            System.out.println("Content successfully written to the file");
        }
        catch(IOException e){
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
}
