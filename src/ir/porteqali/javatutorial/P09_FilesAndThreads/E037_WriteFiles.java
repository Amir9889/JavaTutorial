package ir.porteqali.javatutorial.P09_FilesAndThreads;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class E037_WriteFiles {

    public E037_WriteFiles(){

        /*
          Create a new file
         */
        String data = "and s";
        File file = new File("D:\\Ameer\\books\\file.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
          Write data into file
         */
        try {
            FileWriter fileWriter=new FileWriter("D:\\Ameer\\books\\file.txt");
            fileWriter.append(data).append(" asdasdsa d343").append("sad121231 سشیتسشیشسن");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
