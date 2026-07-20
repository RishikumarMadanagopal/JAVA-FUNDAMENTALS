import java.io.FileWriter;
import java.io.IOException;

public  class createafilej{
    public static void main(String[] args) {
        try{ FileWriter obj = new FileWriter("myfiles.txt",true);
        obj.write("appended text ");
        obj.close();
        System.err.println("Successfully wrote to the file.");
        
            // if(obj.createNewFile()){
            //     System.out.println("File created: " + obj.getName());
            // }
            // else{
            //     System.out.println("File already exists.");
            // }
 }

 catch(IOException e){
    System.out.println("An error occurred."+e.getMessage());
 }


        }
    }
