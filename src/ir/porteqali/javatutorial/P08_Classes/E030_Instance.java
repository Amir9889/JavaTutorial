package ir.porteqali.javatutorial.P08_Classes;

public class E030_Instance {

    public void start(){

        System.out.println(getClass().getSimpleName());
        E030_Instance_Example example=new E030_Instance_Example();
        example.printClassName();
        example.hello("Amir");
    }
}
