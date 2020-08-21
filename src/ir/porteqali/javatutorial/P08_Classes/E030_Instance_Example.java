package ir.porteqali.javatutorial.P08_Classes;

public class E030_Instance_Example {

    public void printClassName(){
        System.out.println(getClass().getSimpleName());
    }

    public void hello(String name){
        System.out.println("Hello "+name);
    }
}
