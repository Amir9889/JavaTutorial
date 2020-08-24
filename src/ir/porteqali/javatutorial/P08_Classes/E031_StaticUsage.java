package ir.porteqali.javatutorial.P08_Classes;

public class E031_StaticUsage {

    public void start(){

        System.out.println(getClass().getSimpleName());

        E030_Instance_Example object= new E030_Instance_Example();
        object.printClassName();
        object.hello("Amir");

        String name =E030_Instance_Example.myName("Ali");
        name=E030_Instance_Example.myName("javad");
        System.out.println(name);
    }
}
