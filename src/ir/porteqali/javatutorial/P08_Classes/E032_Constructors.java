package ir.porteqali.javatutorial.P08_Classes;

public class E032_Constructors {

    public E032_Constructors(){
        System.out.println(getClass().getSimpleName());
    }
    public E032_Constructors(String name){
        System.out.println(getClass().getSimpleName()+": "+name);
    }
    public E032_Constructors(String name, int age){
        System.out.println(getClass().getSimpleName()+": "+name+" and "+age+" years old.");
    }
}
