package ir.porteqali.javatutorial.P09_FilesAndThreads;

import javax.sound.midi.Soundbank;

public class E035_Threads {

    public E035_Threads(){
        System.out.println(getClass().getSimpleName());
        mainThread();
        downloadThread();
        uploadThread();
    }

    public void mainThread(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    System.out.println("Main works is running now!!!");
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

    public void downloadThread(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                int counter =0;
                while (true){
                    System.out.println("Downloading task is running now!!!");
                    try {
                        Thread.sleep(500);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    counter++;
                    if (counter>10){
                        System.out.println("*** Downloading task finished");
                        break;
                    }
                }
            }
        }).start();
    }

    public void uploadThread(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                int counter=0;
                while (true){
                    System.out.println("Uploading in running now!!!");
                    try {
                        Thread.sleep(750);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    counter++;
                    if (counter>13){
                        System.out.println("*** Uploading task finished");
                        break;
                    }
                }
            }
        }).start();
    }
}
