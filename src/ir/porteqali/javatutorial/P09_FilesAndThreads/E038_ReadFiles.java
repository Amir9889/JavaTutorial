package ir.porteqali.javatutorial.P09_FilesAndThreads;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class E038_ReadFiles {

    public E038_ReadFiles(){

        /*
        Read a file
         */
        File file = new File("D:\\Ameer\\books\\file.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
