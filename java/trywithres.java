import java.io.FileOutputStream;
import java.io.IOException;


public class trywithres {

    public static void main(String[] args) {
        
        try (FileOutputStream output = new FileOutputStream("file.txt");){
            
            output.write("Hello".getBytes());
            System.err.println("Successfully wrote to the file.");
            }
            catch(IOException e){

                System.err.println("An error occurred while writing to the file.");
            }
        
        
        }

    }
