package ir.porteqali.javatutorial.P09_FilesAndThreads;

import java.io.File;

public class E036_Files {

    public E036_Files(){
        System.out.println(getClass().getSimpleName());
        File file=new File("D:\\Ameer\\books");
        System.out.println(file.getTotalSpace());
    }
}
