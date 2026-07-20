import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public  class readthedata{
    public static void main(String[] args) {
        try{ 
        Scanner obj = new Scanner(new File("myfiles.txt"));
        while(obj.hasNextLine()){
            String data= obj.nextLine();
            System.out.println(data);

        }
        obj.close();
        
    }

    catch(IOException e){
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
}


}
